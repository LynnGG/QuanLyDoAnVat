/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayThongTin;
import GetAndSet.BaoCao;      
import connect.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class HamBaoCao {
     public void addMenu(BaoCao tl){
     Connection connection = JDBCConnection.JDBCConnection();          
            String sql = "INSERT INTO baoCao(id, baoCao, phanhoi) "
                    + "values (?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getId());
                preparedStatement.setString(2, tl.getBaoCao());
                preparedStatement.setString(3, tl.getPhanhoi());
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

