/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author sejal
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","yash");
        return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
    
}
