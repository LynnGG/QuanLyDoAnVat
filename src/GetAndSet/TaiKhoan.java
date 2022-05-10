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
public class TaiKhoan {
    private String taiKhoan;
    private String matKhau;
    private String hoTen;
    private String sdt;
    private String chucVu;
    private String diaChi;

    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau, String hoTen, String sdt, String chucVu, String diaChi) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
