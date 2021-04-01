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
public class DocGia {
    String mathe, tendocgia, ngayBD, ngayKT,ghichu,Lop,Khoa, NgaySinh;

    public DocGia() {
    }

    public DocGia(String tendocgia, String ngayBD, String ngayKT, String ghichu, String Lop, String Khoa, String NgaySinh) {
        this.tendocgia = tendocgia;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.ghichu = ghichu;
        this.Lop = Lop;
        this.Khoa = Khoa;
        this.NgaySinh = NgaySinh;
    }

    
    public DocGia(String mathe, String tendocgia, String ngayBD, String ngayKT, String ghichu, String Lop, String Khoa, String NgaySinh) {
        this.mathe = mathe;
        this.tendocgia = tendocgia;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.ghichu = ghichu;
        this.Lop = Lop;
        this.Khoa = Khoa;
        this.NgaySinh = NgaySinh;
    }

    public String getMathe() {
        return mathe;
    }

    public void setMathe(String mathe) {
        this.mathe = mathe;
    }

    public String getTendocgia() {
        return tendocgia;
    }

    public void setTendocgia(String tendocgia) {
        this.tendocgia = tendocgia;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }    
}
