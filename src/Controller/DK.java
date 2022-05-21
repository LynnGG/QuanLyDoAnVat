/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GetAndSet.Menu;
import GetAndSet.TaiKhoan;
import connect.JDBCConnection;
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
 * @author trant
 */
public class DK {

    public List<TaiKhoan> getListLogin() {
        connectServer cnn = new connectServer();
        Connection con = cnn.connectSQL("sa", "123", "LAPTOP-TS26SMTG\\TTRANG", "quanlydoanvat");
        Statement stm = null;
        ResultSet rs = null;
        String sql = "Select * from taiKhoan";
        List<TaiKhoan> listTaiKhoan = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                TaiKhoan dn = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listTaiKhoan.add(dn);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listTaiKhoan;
    }

    public void addLogin(TaiKhoan dn) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "insert into taiKhoan values(?, ?, ?, ?,?,?)";

        try {
            Connection con = cnn.connectSQL("sa", "123", "LAPTOP-TS26SMTG\\TTRANG", "quanlydoanvat");

            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, dn.getTaiKhoan());
            pstmt.setString(2, dn.getMatKhau());
            pstmt.setString(3, dn.getHoTen());
            pstmt.setString(4, dn.getSdt());
            pstmt.setString(5, "NV");
            pstmt.setString(6, "DN");

            pstmt.execute();
            //JOptionPane.showMessageDialog(null, "Thêm Thành Công");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void delLogin(TaiKhoan dn) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "delete from taiKhoan where taiKhoan = ? ";
        try {
            Connection con = cnn.connectSQL("sa", "123", "LAPTOP-TS26SMTG\\TTRANG", "quanlydoanvat");
            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, dn.getTaiKhoan());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Xóa Thành Công");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void editLogin(TaiKhoan dn) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "update taiKhoan set matKhau = ? , soDienThoai = ?, hoTen = ? where taiKhoan = ? ";
        try {
            Connection con = cnn.connectSQL("sa", "123", "LAPTOP-TS26SMTG\\TTRANG", "quanlydoanvat");
            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, dn.getMatKhau());
            pstmt.setString(2, dn.getSdt());
            pstmt.setString(3, dn.getHoTen());
            pstmt.setString(4, dn.getTaiKhoan());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Chỉnh Sửa Thành Công Thành Công");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public boolean checkLogin(TaiKhoan dn) {
        List<TaiKhoan> listTaiKhoan = new ArrayList<>();
        listTaiKhoan = getListLogin();
        for (TaiKhoan d : listTaiKhoan) {
            if (d.getTaiKhoan().equals(dn.getTaiKhoan()) && d.getMatKhau().equals(dn.getMatKhau())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTK(TaiKhoan dn) {
        List<TaiKhoan> listTaiKhoan = new ArrayList<>();
        listTaiKhoan = getListLogin();
        for (TaiKhoan d : listTaiKhoan) {
            if (d.getTaiKhoan().equals(dn.getTaiKhoan())) {
                return true;
            }
        }
        return false;
    }

    public int getNV() {
        List<TaiKhoan> listTaiKhoan = new ArrayList<>();
        listTaiKhoan = getListLogin();
        return listTaiKhoan.size();
    }
    
    public List<Menu> getAllMenu() {
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
}
