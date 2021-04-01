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
public class MuonTL {
    String maMuonTra,maThe,maTL,ngayMuon,ghiChu;
    
    public MuonTL(){
        
    }

    public MuonTL(String maThe, String maTL, String ngayMuon, String ghiChu) {
        this.maThe = maThe;
        this.maTL = maTL;
        this.ngayMuon = ngayMuon;
        this.ghiChu = ghiChu;
    }

    public MuonTL(String maMuonTra, String maThe, String maTL, String ngayMuon, String ghiChu) {
        this.maMuonTra = maMuonTra;
        this.maThe = maThe;
        this.maTL = maTL;
        this.ngayMuon = ngayMuon;
        this.ghiChu = ghiChu;
    }

    public String getMaMuonTra() {
        return maMuonTra;
    }

    public void setMaMuonTra(String maMuonTra) {
        this.maMuonTra = maMuonTra;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
