/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qltv.DTO.MuonTL;
import qltv.DTO.PhieuMuonTra;
import qltv.DTO.TraTL;
/**
 *
 * @author Lenovo L340
 */
public class PhieuMuonModify {
    public static List<PhieuMuonTra> finAll() {
        List<PhieuMuonTra> PhieuMuonTraList = new ArrayList<>();
        Statement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "select * from muontra";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                PhieuMuonTra pm = new PhieuMuonTra(resultSet.getString("maMuonTra"),resultSet.getString("maThe"),resultSet.getString("maTL"),resultSet.getString("ngayMuon"),
                        resultSet.getString("ngayTra"),resultSet.getInt("daTra"),resultSet.getString("ghiChu"));
                
                PhieuMuonTraList.add(pm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return PhieuMuonTraList;
    }
    
     public static void MuonTL(MuonTL mtl){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "insert into muontra(maMuonTra,maThe,maTL,ngayMuon,ghiChu) values(?,?,?,?,?)";
            statement =  connection.prepareCall(sql);
            
            statement.setString(1, mtl.getMaMuonTra());
            statement.setString(2, mtl.getMaThe());
            statement.setString(3, mtl.getMaTL());
            statement.setString(4, mtl.getNgayMuon());
            statement.setString(5, mtl.getGhiChu());

            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
     
      public static void TraTL(TraTL ttl){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "update muontra set ngayTra = ?, daTra = ?, ghiChu = ? where maMuonTra = ?";
            statement =  connection.prepareCall(sql);
            
            statement.setString(4, ttl.getMaMuonTra());
            statement.setString(1, ttl.getNgayTra());
            statement.setInt(2, ttl.getDaTra());
            statement.setString(3, ttl.getGhiChu());

            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
     
     public static List<PhieuMuonTra> timkiem(String maMuonTra){
          List<PhieuMuonTra> PhieuMuonSearch = new ArrayList<>();
          PreparedStatement statement = null;
          ResultSet resultSet;
        
          Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "select * from muontra where maMuonTra = ?";
            statement =  connection.prepareStatement(sql);
            
            statement.setString(1, maMuonTra);  
            
            resultSet = statement.executeQuery();
            while (resultSet.next()) {                
                PhieuMuonTra pm = new PhieuMuonTra(resultSet.getString("maMuonTra"),resultSet.getString("maThe"),resultSet.getString("maTL"),
                        resultSet.getString("ngayMuon"),resultSet.getString("ngayTra"),resultSet.getInt("daTra"),resultSet.getString("ghiChu"));
            
                PhieuMuonSearch.add(pm);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DocGiaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return PhieuMuonSearch;
    }
}
