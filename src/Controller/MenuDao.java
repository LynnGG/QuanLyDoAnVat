/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import GetAndSet.Menu;
import connect.JDBCConnection;
import connect.connectServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MenuDao {
    public void addMenu(Menu tl){
     Connection connection = JDBCConnection.JDBCConnection();          
            String sql = "INSERT INTO maDoAn(maDoAn, tenDoAn, loaiDoAn, giaThanh) "
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
    public int updateMenu(Menu tl){
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update maDoAn set tenDoAn = ?, loaiDoAn = ?, giaThanh = ?, where maDoAn = ? ";
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
    public void deleteMenu(String maDoAn){
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
     public void editMenu(Menu menu) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "update Menu set maDoAn = ? , tenDoAn = ?, loaiDoAn = ?, giaThanh = ?";
        try {
            Connection con = cnn.connectSQL("sa", "123", "LAPTOP-TS26SMTG\\TTRANG", "quanlydoanvat");
            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, menu.getMaDoAn());
            pstmt.setString(2, menu.getTenDoAn());
            pstmt.setString(3, menu.getLoaiDoAn());
            pstmt.setString(4, menu.getGiaThanh());

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Chỉnh Sửa Thành Công Thành Công");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
     
    public ArrayList<Menu> findMenu(String maDoAn){
        ArrayList<Menu> ql = new ArrayList<Menu>();
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from Menu where maDoAn like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+maDoAn+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Menu tl = new Menu();
                tl.setMaDoAn(rs.getString("maDoAn"));
                tl.setTenDoAn(rs.getString("tenDoAn"));
                tl.setLoaiDoAn(rs.getString("loaiDoAn"));
                tl.setGiaThanh(rs.getString("giaThanh"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
}
