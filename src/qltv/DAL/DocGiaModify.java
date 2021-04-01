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
import qltv.DTO.DocGia;

/**
 *
 * @author Lenovo L340
 */
public class DocGiaModify {

    public static List<DocGia> finAll() {
        List<DocGia> TheMuonList = new ArrayList<>();
        Statement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "select * from thetv";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                DocGia tm = new DocGia(resultSet.getString("maThe"),resultSet.getString("ngayKT"),resultSet.getString("ngayBD"),resultSet.getString("ghichu"),
                resultSet.getString("tenDG"),resultSet.getString("lop"),resultSet.getString("khoa"),resultSet.getString("ngaysinh"));
                
                TheMuonList.add(tm);
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
        return TheMuonList;
    }
    
    public static void insert(DocGia tm){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "insert into thetv values(?,?,?,?,?,?,?,?)";
            statement =  connection.prepareCall(sql);
            
            statement.setString(1, tm.getMathe());
            statement.setString(2, tm.getNgayBD());
            statement.setString(3, tm.getNgayKT());
            statement.setString(4, tm.getGhichu());
            statement.setString(5, tm.getTendocgia());
            statement.setString(6, tm.getLop());
            statement.setString(7, tm.getKhoa());
            statement.setString(8, tm.getNgaySinh());
            
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
     public static void update(DocGia tm){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "update thetv set ngayBD = ?, ngayKT = ?, ghichu = ?, tenDG = ?, lop = ?, khoa = ?, ngaysinh = ? where maThe = ?";
            statement =  connection.prepareCall(sql);
            
            statement.setString(8, tm.getMathe());
            statement.setString(1, tm.getNgayBD());
            statement.setString(2, tm.getNgayKT());
            statement.setString(3, tm.getGhichu());
            statement.setString(4, tm.getTendocgia());
            statement.setString(5, tm.getLop());
            statement.setString(6, tm.getKhoa());
            statement.setString(7, tm.getNgaySinh());
            
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
      public static void delete(String maThe){
        PreparedStatement statement = null;
        
        Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "delete from theTV where maThe = ?";
            statement =  connection.prepareCall(sql);
            
            statement.setString(1, maThe);

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
      public static List<DocGia> timkiem(String maThe){
          List<DocGia> TheMuonSearch = new ArrayList<>();
          PreparedStatement statement = null;
          ResultSet resultSet;
        
          Connection connection = null;
        try {
            //lay tat ca danh sach the muon
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv", "root", "");
            //query
            
            String sql = "select * from theTV where maThe = ?";
            statement =  connection.prepareStatement(sql);
            
            statement.setString(1, maThe);  
            
            resultSet = statement.executeQuery();
            while (resultSet.next()) {                
                DocGia tm = new DocGia(resultSet.getString("maThe"),resultSet.getString("ngayBD"),resultSet.getString("ngayKT"),resultSet.getString("ghichu"),
                resultSet.getString("tenDG"),resultSet.getString("lop"),resultSet.getString("khoa"),resultSet.getString("ngaysinh"));
            
                TheMuonSearch.add(tm);
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
        return TheMuonSearch;
    }
}

