package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public Connection conectar(){            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/iniciodesesion",
            "juankafut", "chelita97");
            
        } 
        catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null; 
        }                       
    }               
}
    
    

