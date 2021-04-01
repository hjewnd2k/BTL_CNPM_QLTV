/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.DTO;

/**
 *
 * @author Lenovo L340
 */
public class TraTL {
    String maMuonTra,ngayTra;
    int daTra;
    String ghiChu;
    
    public TraTL(){
        
    }

    public TraTL(String maMuonTra, String ngayTra, int daTra, String ghiChu) {
        this.maMuonTra = maMuonTra;
        this.ngayTra = ngayTra;
        this.daTra = daTra;
        this.ghiChu = ghiChu;
    }

    public TraTL(String ngayTra, int daTra, String ghiChu) {
        this.ngayTra = ngayTra;
        this.daTra = daTra;
        this.ghiChu = ghiChu;
    }

    public String getMaMuonTra() {
        return maMuonTra;
    }

    public void setMaMuonTra(String maMuonTra) {
        this.maMuonTra = maMuonTra;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getDaTra() {
        return daTra;
    }

    public void setDaTra(int daTra) {
        this.daTra = daTra;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
