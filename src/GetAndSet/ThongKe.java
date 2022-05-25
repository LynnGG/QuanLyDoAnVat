/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetAndSet;

/**
 *
 * @author trant
 */
public class ThongKe {
    private String maHoaDon;
    private String ngayNhapHoaDon;
    private int soTienHoaDon;

    public ThongKe() {
    }

    public ThongKe(String maHoaDon, String ngayNhapHoaDon, int soTienHoaDon) {
        this.maHoaDon = maHoaDon;
        this.ngayNhapHoaDon = ngayNhapHoaDon;
        this.soTienHoaDon = soTienHoaDon;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayNhapHoaDon() {
        return ngayNhapHoaDon;
    }

    public void setNgayNhapHoaDon(String ngayNhapHoaDon) {
        this.ngayNhapHoaDon = ngayNhapHoaDon;
    }

    public int getSoTienHoaDon() {
        return soTienHoaDon;
    }

    public void setSoTienHoaDon(int soTienHoaDon) {
        this.soTienHoaDon = soTienHoaDon;
    }
    
}
