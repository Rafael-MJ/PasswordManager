package securepass.connections;

import java.awt.TextArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import securepass.model.SenhasCadastradas;
import securepass.model.UserInfo;
import securepass.view.jFramePassList;

public class Connections {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    jFramePassList pl;
    
    public void setSenha(String tipo, String titulo, String senha, String socialUser, String link, String UserId){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        
        try {
            ps = con.prepareStatement("call CadastroSenha(?,?,?,?,?,?);");
            
            ps.setString(1, tipo);
            ps.setString(2, titulo);
            ps.setString(3, senha);
            ps.setString(4, socialUser);
            ps.setString(5, link);
            ps.setString(6, UserInfo.getUserID());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro Realizado!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Cadastro: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public void deletePass(int id){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        
        try {
            ps = con.prepareStatement("DELETE FROM cadastros_senhas WHERE id=" + id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public ArrayList<SenhasCadastradas> getSenhas(){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        ArrayList<SenhasCadastradas> s = new ArrayList<>();
        int id;
        String data, tipo, titulo;
        
        try {
            ps = con.prepareStatement("select cadastros_senhas.id,cadastros_senhas.data,cadastros_senhas.tipo,cadastros_senhas.titulo from cadastros_senhas join usuarios "
                    + "on cadastros_senhas.user_id = usuarios.id where usuarios.id = "+UserInfo.getUserID()+";");
            rs = ps.executeQuery();
            
            while(rs.next()){
                SenhasCadastradas sc = new SenhasCadastradas();
                id = rs.getInt("cadastros_senhas.id");
                data = rs.getString("cadastros_senhas.data");
                tipo = rs.getString("cadastros_senhas.tipo");
                titulo = rs.getString("cadastros_senhas.titulo");
            
                sc.setSenhas(id, data, tipo, titulo);
                s.add(sc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
    }
        return s;
    }
    
    public TextArea getInfos(int passId){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        TextArea ta = null;
        String pass = "", tipo = "", titulo = "", mediaUser = "", link = "";
        int id;
        pl = new jFramePassList();
        
        try {
            ps = con.prepareStatement("select cadastros_senhas.id,cadastros_senhas.tipo,cadastros_senhas.titulo,cadastros_senhas.password,cadastros_senhas.mediaUser,cadastros_senhas.link "
                    + "from cadastros_senhas join usuarios on cadastros_senhas.user_id = usuarios.id where usuarios.id = "+UserInfo.getUserID()+" and cadastros_senhas.id = '"+passId+"';");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("cadastros_senhas.id");
                pass = rs.getString("cadastros_senhas.password");
                titulo = rs.getString("cadastros_senhas.titulo");
                tipo = rs.getString("cadastros_senhas.tipo");
                mediaUser = rs.getString("cadastros_senhas.mediaUser");
                link = rs.getString("cadastros_senhas.link");
                
                if(id == pl.getSelectedID()){
                    break;
                }
            }
            int largerLenght = pass.length();
            String border = "";
            
            if(titulo.length() > largerLenght){
                largerLenght = titulo.length();
            }
            if(mediaUser.length() > largerLenght){
                largerLenght = mediaUser.length();
            }
            if(link.length() > largerLenght){
                largerLenght = link.length();
            }
            int WIDTH = 32;
            
            if(largerLenght >= 15){
                WIDTH = largerLenght+20;
            }
            
            for(int i = 0; i <= WIDTH; i++){
                border+="=";
            }

            if(!tipo.equals("Simples")){
                ta = new TextArea(null,12,WIDTH,TextArea.SCROLLBARS_NONE);
                ta.setEditable(false);
                ta.setFocusable(true);
                ta.setText(" "+border+"\n\n\tTitulo: "+ titulo + "\n\n\tTipo: "+ tipo + 
                       "\n\n\tSenha: "+ pass + "\n\n\tUsuario: " + mediaUser +
                       "\n\n\tLink: " + link + "\n\n "+border);
            }else{
                ta = new TextArea(null,8,WIDTH,TextArea.SCROLLBARS_NONE);
                ta.setEditable(false);
                ta.setFocusable(true);
                ta.setText(" "+border+"\n\n\tTitulo: "+ titulo + "\n\n\tTipo: "+ tipo + 
                       "\n\n\tSenha: "+ pass + "\n\n "+border);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, ps, rs);
        }
        return ta;
    }
    
    public void updateSenha(int id, String titulo, String password, String mediaUser, String link){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        String tipo = "";
        
        try {
            ps = con.prepareStatement("select tipo from cadastros_senhas where id = "+id+";");
            rs = ps.executeQuery();
            
            if(tipo.equals("Simples")){
                ps = con.prepareStatement("UPDATE cadastros_senhas SET titulo = ?, password = ? WHERE cadastros_senhas.id = "+id+";");

                ps.setString(1, titulo);
                ps.setString(2, password);
                ps.setString(3, mediaUser);
                ps.setString(4, link);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informações alteradas!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            }else{
                ps = con.prepareStatement("UPDATE cadastros_senhas SET titulo = ?, password = ?, mediaUser = ?,"
                    + "link = ? WHERE cadastros_senhas.id = "+id+";");
                
                ps.setString(1, titulo);
                ps.setString(2, password);
                ps.setString(3, mediaUser);
                ps.setString(4, link);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informações alteradas!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public void cadastroPrestador(String nome, String telefone, String email, String curriculo){
        
        con = ConnectionFactory.connectDB();
        ps = null;
        rs = null;
        String veruser, vertel, veremail, vercurr;
        boolean sucess = true;
        
        try {
            ps = con.prepareStatement("call CadastroPrestador(?,?,?,?);");
            
            ps.setString(1, nome);
            ps.setString(2, telefone);
            ps.setString(3, email);
            ps.setString(4, curriculo);
            
            rs = ps.executeQuery("SELECT Nome,Telefone,Email,Curriculo FROM prestador_servico;");
            
            while(rs.next()){
                
                veruser = rs.getString("Nome");
                vertel = rs.getString("Telefone");
                veremail = rs.getString("Email");
                vercurr = rs.getString("Curriculo");
                
                if(veruser.equals(nome) || vertel.equals(telefone) 
                        || veremail.equals(email) || vercurr.equals(curriculo)){

                    JOptionPane.showMessageDialog(null, "Erro ao enviar, solicitação já realizada.\nAguarde uma resposta!", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                    sucess = false;
                    break;
                }
            }
            if(sucess == true){
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Solicitação enviada! Aguarde entrarmos em contato.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na solicitação: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            ConnectionFactory.closeConnection(con, ps, rs);
        }
    }
}