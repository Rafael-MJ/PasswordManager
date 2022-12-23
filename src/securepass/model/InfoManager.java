package securepass.model;

import javax.swing.JOptionPane;
import securepass.connections.DAO;

public class InfoManager {

    DAO dao = new DAO();
    private static String SELECTED_TYPE = "", SELECTED_TITLE = "";
    private static int SELECTED_PASSID;
    
    public static int getSelectedPassID(){
        
        return SELECTED_PASSID;
    }
    
    public static void setSelectedPassID(int pass){
        
        SELECTED_PASSID = pass;
    }
    
    public static String getSelectedType(){
        
        return SELECTED_TYPE;
    }
    
    public static void setSelectedType(String type){
        
        SELECTED_TYPE = type;
    }
    
    public static String getSelectedTitle(){
        
        return SELECTED_TITLE;
    }
    
    public static void setSelectedTitle(String title){
        
        SELECTED_TITLE = title;
    }
    
    public boolean passVerify(String newPass){
        boolean passed = false;
        
        if(newPass.equals(dao.getSenha())){
            passed = true;
            JOptionPane.showMessageDialog(null, "Identidade Confirmada!" , "SUCESSO", JOptionPane.INFORMATION_MESSAGE, null);
        }else{
            
            JOptionPane.showMessageDialog(null, "Senha Incorreta!" , "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
        return passed;
    }
}
