package securepass.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

    static String USER = "root",
                  PASS = "",
                  URL = "jdbc:mysql://localhost:3306/securepass",
                  DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static Connection connectDB(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new RuntimeException("Erro ao conectar-se ao banco");
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement ps){
        if(con != null){
            
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs){
        if(con != null){
            
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}