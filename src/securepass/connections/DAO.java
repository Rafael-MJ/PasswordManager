package securepass.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import securepass.model.Acessos;
import securepass.model.UserInfo;

public class DAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean cadastro(String getName, String getLogin, String getSenha){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        String veruser, passCrypto;
        boolean sucess = true;
        
        passCrypto = UserInfo.cryptoPass(getSenha);
        
        try {
            ps = con.prepareStatement("call Cadastro(?,?,?);");
            
            ps.setString(1, getName);
            ps.setString(2, getLogin);
            ps.setString(3, passCrypto);
            
            rs = ps.executeQuery("SELECT username FROM usuarios");
            
            while(rs.next()){
                
                veruser = rs.getString("username");
                
                if(veruser.equals(getLogin)){

                    JOptionPane.showMessageDialog(null, "Erro no cadastro, usuário já existente.\nRealize o login!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                    sucess = false;
                    break;
                }
            }
            if(sucess == true){
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastro realizado! Realize o Login.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps, rs);
        }
        return sucess;
    }
    
    public void setSenha(String senha){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        String passCrypto = UserInfo.cryptoPass(senha);
        
        try {
            ps = con.prepareStatement("UPDATE login join usuarios on login.username=usuarios.username SET login.senha = ? WHERE usuarios.id = "+UserInfo.getUserID()+";");
            
            ps.setString(1, passCrypto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha alterada! Realize o login novamente.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public boolean login(String login, String pass){
        
       con = ConnectionFactory.connectDB();
       ps = null;
       rs = null;
       String nome, senha, passCrypto;
       int id;
       boolean passed = false;
       passCrypto = UserInfo.cryptoPass(pass);
       
        try {
            ps = con.prepareStatement("call Login('" + login +"', '"+ passCrypto +"');");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                id = rs.getInt("usuarios.id");
                nome = rs.getString("usuarios.username");
                senha = rs.getString("login.senha");
                
                if(login.equals(nome) && passCrypto.equals(senha)){
                    passed = true;
                    UserInfo.setUserID(String.valueOf(id));
                }else{
                    passed = false;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
        }
        if(passed == false){
            
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto(s): ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }else{
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
        }
        return passed;
    }
    
    public String getSenha(){
        
        String senha = "";
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        String passUncrypto = "";
        
        try {
            ps = con.prepareStatement("SELECT login.senha FROM login join usuarios on login.username = usuarios.username WHERE usuarios.id = " + UserInfo.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                senha = rs.getString("senha");
            }
            
           passUncrypto = UserInfo.uncryptoPass(senha);
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return passUncrypto;
    }
    
    public ArrayList<Acessos> getAcessos(){
        
        con = ConnectionFactory.connectDB();
        
        ps = null;
        rs = null;
        ArrayList<Acessos> a = new ArrayList<>();
        int id;
        String data;
        
        try {
            ps = con.prepareStatement("select acesso.id,acesso.data from acesso join usuarios "
                    + "on usuarios.username = acesso.username where usuarios.id = "+UserInfo.getUserID()+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Acessos ac = new Acessos();
                id = rs.getInt("acesso.id");
                data = rs.getString("acesso.data");
            
                ac.setAcess(id, data);
                a.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return a;
    }
    
    public String getNome(){
        
        String nome = "";
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        
        try {
            ps = con.prepareStatement("SELECT nome, sobrenome FROM usuarios WHERE id = " + UserInfo.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                nome = rs.getString("nome");
                nome += (" ");
                nome += rs.getString("sobrenome");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return nome;
    }
}