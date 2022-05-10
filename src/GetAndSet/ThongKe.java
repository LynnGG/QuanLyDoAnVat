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
    private String soTienHoaDon;

    public ThongKe() {
    }

    public ThongKe(String maHoaDon, String ngayNhapHoaDon, String soTienHoaDon) {
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

    public String getSoTienHoaDon() {
        return soTienHoaDon;
    }

    public void setSoTienHoaDon(String soTienHoaDon) {
        this.soTienHoaDon = soTienHoaDon;
    }
    
}
