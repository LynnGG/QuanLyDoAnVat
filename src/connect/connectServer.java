/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lynn
 */
public class connectServer {
     public Connection connectSQL(String user,String pass,String serverName,String dataName) {
// Create datasource. 
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(pass);
        ds.setServerName(serverName);
        ds.setPortNumber(1433);
        ds.setDatabaseName(dataName);
        ds.setEncrypt(false);
        ds.setTrustServerCertificate(false);
        try {
            return ds.getConnection();
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
