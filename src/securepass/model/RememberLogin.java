package securepass.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RememberLogin {

    boolean REMEMBER = false;
    String login = "", senha = "";
    File file = new File("login.txt");
    FileWriter fw;
    Scanner scan;
    
    public boolean isRemembered(){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(RememberLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                scan = new Scanner(file);
                String cryptopass = "";
                
                while(scan.hasNextLine()){
                    REMEMBER = true;
                    login = scan.nextLine().replace("Login: ", "");
                    cryptopass = scan.nextLine().replace("Senha: ", "");
                }
                scan.close();
                String passUncrypto = UserInfo.uncryptoPass(cryptopass);
                senha = passUncrypto;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RememberLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return REMEMBER;
    }
    
    public void setLogin(String user, String pass){
        String passCrypto = UserInfo.cryptoPass(pass);
        
        if(file.exists()){
            try {
                fw = new FileWriter(file);
                fw.write("Login: "+ user + "\nSenha: " + passCrypto);
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(RememberLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
         }else{
            try {
                file.createNewFile();
                
                fw = new FileWriter(file);
                fw.write("Login: "+ user + "\nSenha: " + passCrypto);
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(RememberLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String getUsername(){
        
        return login;
    }
    
    public String getSenha(){
        
        return senha;
    }
    
    public void clear(){
        login = "";
        senha = "";
        REMEMBER = false;
        
        if(file.exists()){
            file.delete();
        }
    }
}