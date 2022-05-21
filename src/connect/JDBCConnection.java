/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class JDBCConnection {
    public static Connection JDBCConnection() {
        final String Url = "jdbc:sqlserver://LAPTOP-NUMGUVDK:1433;databaseName=quanlydoanvat";
        final String user = "sa";
        final String pass = "huan26052002";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
    public static void main(String[] args){
    Connection connection = JDBCConnection();
       if (connection !=  null){
           System.out.println("Thành công");
       }
       else 
            System.out.println("Thất bại");
    }

    
    
}
