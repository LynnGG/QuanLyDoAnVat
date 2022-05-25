/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author trant
 */
public class danhmuc {
    private String kinds;
    private JPanel jpn;
    private JLabel jlb;

    public danhmuc(String kinds, JPanel jpn, JLabel jlb) {
        this.kinds = kinds;
        this.jpn = jpn;
        this.jlb = jlb;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }

    public danhmuc() {
    }
        
}
