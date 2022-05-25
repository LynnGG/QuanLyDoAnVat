/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GetAndSet.ThongKe;
import GetAndSet.money;
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
 * @author lynn
 */
public class HoaDon_C {

    public List<ThongKe> getListHoaDon() {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "Select * from thongKe";
        List<ThongKe> listThongKe = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                ThongKe dn = new ThongKe(rs.getString(1), rs.getString(2), rs.getInt(3));
                listThongKe.add(dn);
            }
            return listThongKe;

        } catch (Exception e) {
            System.out.println(e);
        }
        return listThongKe;
    }

    public void addHoaDon(ThongKe dn) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "insert into thongKe values(?, ?, ?)";

        try {
            Connection con = cnn.connect();

            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, dn.getMaHoaDon());
            pstmt.setString(2, dn.getNgayNhapHoaDon());
            pstmt.setInt(3, dn.getSoTienHoaDon());

            pstmt.execute();
            //JOptionPane.showMessageDialog(null, "Thêm Thành Công");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void delHoaDon(ThongKe dn) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "delete from thongKe where maHoaDon = ? ";
        try {
            Connection con = cnn.connect();
            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, dn.getMaHoaDon());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Xóa Thành Công");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void editHoaDon(ThongKe dn) {
        connectServer cnn = new connectServer();
        PreparedStatement pstmt = null;
        String Sql = "update thongKe set ngayNhapHoaDon = ? , soTienHoaDon = ? where maHoaDon = ? ";
        try {
            Connection con = cnn.connect();
            pstmt = con.prepareCall(Sql);
            pstmt.setString(1, dn.getNgayNhapHoaDon());
            pstmt.setInt(2, dn.getSoTienHoaDon());
            pstmt.setString(3, dn.getMaHoaDon());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Chỉnh Sửa Thành Công Thành Công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getID_HD() {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT TOP 1 * FROM thongKe ORDER BY maHoaDon DESC";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                return String.valueOf(Integer.parseInt(rs.getString(1)) + 1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "0";
    }

    public List<money> getDataMoney() {
        connectServer cnn = new connectServer();
        Connection con = cnn.connect();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "select year(ngayNhapHoaDon), month(ngayNhapHoaDon) ,sum(soTienHoaDon) as Total\n"
                + "from thongKe\n"
                + "group by year(ngayNhapHoaDon), month(ngayNhapHoaDon)";
        List<money> listMoney = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                money m = new money(rs.getString(1), rs.getString(2), rs.getInt(3));
                listMoney.add(m);
            }
            return listMoney;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
