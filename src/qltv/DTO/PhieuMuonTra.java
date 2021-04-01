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
public class PhieuMuonTra {
    String maMuonTra,maThe,maTL,ngayMuon,ngayTra;
    int daTra;
    String ghiChu;
    
    public PhieuMuonTra(){
    }

    public PhieuMuonTra(String maThe, String maTL, String ngayMuon, String ngayTra, int daTra, String ghiChu) {
        this.maThe = maThe;
        this.maTL = maTL;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.daTra = daTra;
        this.ghiChu = ghiChu;
    }

    public PhieuMuonTra(String maPhieu, String maThe, String maTL, String ngayMuon, String ngayTra, int daTra, String ghiChu) {
        this.maMuonTra = maPhieu;
        this.maThe = maThe;
        this.maTL = maTL;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.daTra = daTra;
        this.ghiChu = ghiChu;
    }

    public String getMaMuonTra() {
        return maMuonTra;
    }

    public void setMaPhieu(String maPhieu) {
        this.maMuonTra = maPhieu;
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
