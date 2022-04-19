/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author ACER
 */
public class User_DangKy {

    private String taiKhoan;
    private String matKhau;
    private String nhapLaiMatKhau;
    private String soDienThoai;
    private String email;

    public User_DangKy(String taiKhoan, String matKhau, String nhapLaiMatKhau, String soDienThoai, String email) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.nhapLaiMatKhau = nhapLaiMatKhau;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public User_DangKy() {
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

    public String getNhapLaiMatKhau() {
        return nhapLaiMatKhau;
    }

    public void setNhapLaiMatKhau(String nhapLaiMatKhau) {
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
}
