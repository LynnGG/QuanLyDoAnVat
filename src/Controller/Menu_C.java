/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import GetAndSet.Menu;
import GetAndSet.Menu;
import connect.connectServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Menu_C {

    public List<Menu> getListMenu() {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "Select * from Menu";
        List<Menu> listMenu = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Menu dn = new Menu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listMenu.add(dn);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listMenu;
    }

    public void addMenu(Menu tl) {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        String sql = "INSERT INTO Menu (maDoAn, tenDoAn, loaiDoAn, giaThanh) "
                + "values (?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, tl.getMaDoAn());
            preparedStatement.setString(2, tl.getTenDoAn());
            preparedStatement.setString(3, tl.getLoaiDoAn());
            preparedStatement.setString(4, tl.getGiaThanh());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editMenu(Menu tl) {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        PreparedStatement pstmt = null;

        String sql = "Update Menu set tenDoAn = ?, loaiDoAn = ?, giaThanh = ? where maDoAn = ? ";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tl.getTenDoAn());
            pstmt.setString(2, tl.getLoaiDoAn());
            pstmt.setString(3, tl.getGiaThanh());
            pstmt.setString(4, tl.getMaDoAn());

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Chỉnh Sửa Thành Công Thành Công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteMenu(Menu m) {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        String sql = "delete from Menu where maDoAn = ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, m.getMaDoAn());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Menu> findMenu(String key) {
        List<Menu> ql = new ArrayList<>();
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        String sql = "select * from Menu where loaiDoAn like ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "%" + key + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Menu tl = new Menu();
                tl.setMaDoAn(rs.getString(1));
                tl.setTenDoAn(rs.getString(2));
                tl.setLoaiDoAn(rs.getString(3));
                tl.setGiaThanh(rs.getString(4));
                ql.add(tl);
            }
            return ql;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
}
