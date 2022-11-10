/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NSX;
import DomainModels.SanPham;
import Utilities.DBConnection;
import ViewModels.QLByMa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class NSXRepository {
    public List<NSX> getAll(){
        String sql = "select Id,Ma,Ten from NSX";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            
            List<NSX> list = new ArrayList<>();
            
            while (rs.next()) {                
                list.add(new NSX(rs.getString(1), rs.getString(2),rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean add(NSX nsx){
        String sql = "INSERT INTO NSX (Ma,Ten) VALUES(?,?)";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
              e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean update(NSX nsx,String id){
        String sql ="UPDATE NSX SET Ma =?,Ten =? WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());
            ps.setObject(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean delete(String id){
        String sql ="DELETE FROM NSX WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
             e.printStackTrace(System.out);
        }
        return check>0;
    }
    public QLByMa checkTrung(String ma){
        String sql ="SELECT Ma FROM NSX WHERE Ma =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 QLByMa sp = new QLByMa(rs.getString(1));
                 return sp;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
    public NSX getIdByTen(String ten){
        String sql ="SELECT Id FROM NSX WHERE Ten =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 NSX nsx = new NSX(rs.getString(1));
                 return nsx;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
}
