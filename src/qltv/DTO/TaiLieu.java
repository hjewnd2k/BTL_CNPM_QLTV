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
public class TaiLieu {
    String maTL,tenTL,tacgia,theloai,NXB;
    int namXB,soluong;
    
    public TaiLieu(){
    }

    public TaiLieu(String maTL, String tenTL, String tacgia, String theloai, String NXB, int namXB, int soluong) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.NXB = NXB;
        this.namXB = namXB;
        this.soluong = soluong;
    }

    public TaiLieu(String tenTL, String tacgia, String theloai, String NXB, int namXB, int soluong) {
        this.tenTL = tenTL;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.NXB = NXB;
        this.namXB = namXB;
        this.soluong = soluong;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
