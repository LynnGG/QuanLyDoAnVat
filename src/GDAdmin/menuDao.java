/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GDAdmin;

import GetAndSet.Menu;
import connect.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class menuDao {
    public List<Menu> getAllUsers() {
        List<Menu> ltl = new ArrayList<Menu>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from Menu";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Menu tl = new Menu();
                tl.setMaDoAn(rs.getString("maDoAn"));
                tl.setTenDoAn(rs.getString("tenDoAn"));
                tl.setGiaThanh(rs.getString("loaiDoAn"));
                tl.setLoaiDoAn(rs.getString("giaThanh"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public void add(Menu tl){
     Connection connection = JDBCConnection.JDBCConnection();          
            String sql = "INSERT INTO id (maDoAn, tenDoAn, loaiDoAn, giaThanh) "
                    + "values (?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getMaDoAn());
                preparedStatement.setString(2, tl.getTenDoAn());
                preparedStatement.setString(3, tl.getLoaiDoAn());
                preparedStatement.setString(4, tl.getGiaThanh());
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int updateUser(Menu tl){
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update id set maDoAn = ? , tenDoAn = ?, loaiDoAn = ?, giaThanh = ?, where Id = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tl.getMaDoAn());
            preparedStatement.setString(2, tl.getTenDoAn());
            preparedStatement.setString(3, tl.getLoaiDoAn());
            preparedStatement.setString(4, tl.getGiaThanh());
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public void delete(String maDoAn){
       Connection connection = JDBCConnection.JDBCConnection();
        String sql = "delete from id where m maDoAn = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maDoAn);           
            int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
