/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import Utilities.DBConnection;
import ViewModels.NHanVienViewModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ChucVuRepository {
     public List<ChucVu> getAll(){
        String sql = "SeLECT Id,Ma,Ten FROM ChucVu";
        
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ResultSet rs = ps.executeQuery();
             List<ChucVu> list = new ArrayList<>();
             while (rs.next()) {                 
                 list.add(new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3)));
             }
             return list;
         } catch (Exception e) {
         }
         return null;
    }
     public boolean add(ChucVu cv){
         String sql = "INSERT INTO ChucVu(Ma,Ten) VALUES(?,?)";
        int check = 0;
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, cv.getMa());
             ps.setObject(2, cv.getTen());
             check= ps.executeUpdate();
         } catch (Exception e) {
         }
         return check >0;
     }
     public boolean update(ChucVu cv,String id){
         String sql = "UPDATE ChucVu SET Ma =?,Ten=? WHERE Id = ?";
        int check = 0;
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, cv.getMa());
             ps.setObject(2, cv.getTen());
             ps.setObject(3, id);
             check= ps.executeUpdate();
         } catch (Exception e) {
         }
         return check >0;
     }
     public boolean delete(String id){
         String sql = "DELETE FROM ChucVu WHERE Id = ?";
        int check = 0;
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, id);
             check= ps.executeUpdate();
         } catch (Exception e) {
         }
         return check >0;
     }
      public ChucVu getIdByTen(String ten){
        String sql = "SeLECT Id FROM ChucVu WHERE Ten=?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setObject(1, ten);
             ResultSet rs = ps.executeQuery();
            
             while (rs.next()) {  
                 ChucVu cv = new ChucVu(rs.getString(1));
                 return cv;
             }
             
         } catch (Exception e) {
         }
        return null;
    }
      public List<ChucVu> search(String ma){
        String sql = "SeLECT Id,Ma,Ten FROM ChucVu WHERE Ma =?";
        
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ma);
             ResultSet rs = ps.executeQuery();
             List<ChucVu> list = new ArrayList<>();
             while (rs.next()) {                 
                 list.add(new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3)));
             }
             return list;
         } catch (Exception e) {
         }
         return null;
    }
     public static void main(String[] args) {
         System.out.println(new ChucVuRepository().getAll());
    }
}
