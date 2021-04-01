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
import qltv.DTO.TaiLieu;
/**
 *
 * @author Lenovo L340
 */
public class TaiLieuModifiy {
    public static List<TaiLieu> finAll() {
        List<TaiLieu> TaiLieuList = new ArrayList<>();
        Statement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "select * from tailieu";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                TaiLieu tl;
                tl = new TaiLieu(resultSet.getString("maTL"),resultSet.getString("tenTL"),resultSet.getString("tacGia"),
                        resultSet.getString("theLoai"),resultSet.getString("NXB"),resultSet.getInt("namXB"),resultSet.getInt("soLuong"));
                
                TaiLieuList.add(tl);
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
        return TaiLieuList;
    }
    
    public static void insert(TaiLieu tl){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "insert into tailieu values(?,?,?,?,?,?,?)";
            statement =  connection.prepareCall(sql);
            
            statement.setString(1, tl.getMaTL());
            statement.setString(2, tl.getTenTL());
            statement.setString(3, tl.getTacgia());
            statement.setString(4, tl.getTheloai());
            statement.setString(5, tl.getNXB());
            statement.setInt(6, tl.getNamXB());
            statement.setInt(7, tl.getSoluong());
            
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
     public static void update(TaiLieu tl){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "update tailieu set tenTL = ?, tacGia = ?, theLoai = ?, NXB = ?, namXB = ?, soLuong = ? where maTL = ?";
            statement =  connection.prepareCall(sql);
            
            statement.setString(7, tl.getMaTL());
            statement.setString(1, tl.getTenTL());
            statement.setString(2, tl.getTacgia());
            statement.setString(3, tl.getTheloai());
            statement.setString(4, tl.getNXB());
            statement.setInt(5, tl.getNamXB());
            statement.setInt(6, tl.getSoluong());
            
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
      public static void delete(String maTL){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "delete from tailieu where maTL = ?";
            statement =  connection.prepareCall(sql);
            
            statement.setString(1, maTL);

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
     public static List<TaiLieu> timkiem(String maTL){
          List<TaiLieu> TaiLieuSearch = new ArrayList<>();
          PreparedStatement statement = null;
          ResultSet resultSet;
        
          Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "select * from tailieu where maTL = ?";
            statement =  connection.prepareStatement(sql);
            
            statement.setString(1, maTL);  
            
            resultSet = statement.executeQuery();
            while (resultSet.next()) {                
                TaiLieu tl;
                tl = new TaiLieu(resultSet.getString("maTL"),resultSet.getString("tenTL"),resultSet.getString("tacGia"),
                        resultSet.getString("theLoai"),resultSet.getString("NXB"),resultSet.getInt("namXB"),resultSet.getInt("soLuong"));
                
                TaiLieuSearch.add(tl);
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
        return TaiLieuSearch;
    }
}
