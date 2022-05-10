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
public class BaoCao {
    private String id;
    private String baoCao;
    private String phanhoi;

    public BaoCao() {
    }

    public BaoCao(String id, String baoCao, String phanhoi) {
        this.id = id;
        this.baoCao = baoCao;
        this.phanhoi = phanhoi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaoCao() {
        return baoCao;
    }

    public void setBaoCao(String baoCao) {
        this.baoCao = baoCao;
    }

    public String getPhanhoi() {
        return phanhoi;
    }

    public void setPhanhoi(String phanhoi) {
        this.phanhoi = phanhoi;
    }
    
    
}
