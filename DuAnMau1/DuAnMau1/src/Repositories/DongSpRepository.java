/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSp;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class DongSpRepository {
     public List<DongSp> getAll(){
        String sql = "select Id,Ma,Ten from DongSP";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            
            List<DongSp> list = new ArrayList<>();
            
            while (rs.next()) {                
                list.add(new DongSp(rs.getString(1), rs.getString(2),rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean add(DongSp dsp){
        String sql = "INSERT INTO DongSP (Ma,Ten) VALUES(?,?)";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, dsp.getMa());
            ps.setObject(2, dsp.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
              e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean update(DongSp dsp,String id){
        String sql ="UPDATE DongSP SET Ma =?,Ten =? WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, dsp.getMa());
            ps.setObject(2, dsp.getTen());
            ps.setObject(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean delete(String id){
        String sql ="DELETE FROM DongSP WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
             e.printStackTrace(System.out);
        }
        return check>0;
    }
    public SanPham checkTrung(String ma){
        String sql ="SELECT Ma,Ten FROM DongSP WHERE Ma =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 SanPham sp = new SanPham(rs.getString(1),rs.getString(2));
                 return sp;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
    public DongSp getIdByTen(String ten){
        String sql ="SELECT Id FROM DongSP WHERE Ten =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                DongSp dsp = new DongSp(rs.getString(1));
                 return dsp;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
    public static void main(String[] args) {
        System.out.println(new DongSpRepository().getAll());
    }
}
