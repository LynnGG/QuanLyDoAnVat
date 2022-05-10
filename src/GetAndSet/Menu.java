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
public class Menu {
    private String maDoAn;
    private String tenDoAn;
    private String loaiDoAn;
    private String giaThanh;

    public Menu() {
    }

    public Menu(String maDoAn, String tenDoAn, String loaiDoAn, String giaThanh) {
        this.maDoAn = maDoAn;
        this.tenDoAn = tenDoAn;
        this.loaiDoAn = loaiDoAn;
        this.giaThanh = giaThanh;
    }

    public String getMaDoAn() {
        return maDoAn;
    }

    public void setMaDoAn(String maDoAn) {
        this.maDoAn = maDoAn;
    }

    public String getTenDoAn() {
        return tenDoAn;
    }

    public void setTenDoAn(String tenDoAn) {
        this.tenDoAn = tenDoAn;
    }

    public String getLoaiDoAn() {
        return loaiDoAn;
    }

    public void setLoaiDoAn(String loaiDoAn) {
        this.loaiDoAn = loaiDoAn;
    }

    public String getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(String giaThanh) {
        this.giaThanh = giaThanh;
    }
    
}
