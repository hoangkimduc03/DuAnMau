/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

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
public class SanPhamRepository {
    
    public List<SanPham> getAll(){
        String sql = "select Id,Ma,Ten from SanPham";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            
            List<SanPham> list = new ArrayList<>();
            
            while (rs.next()) {                
                list.add(new SanPham(rs.getString(1), rs.getString(2),rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean add(SanPham sp){
        String sql = "INSERT INTO SanPham (Ma,Ten) VALUES(?,?)";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
              e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean update(SanPham sp,String id){
        String sql ="UPDATE SanPham SET Ma =?,Ten =? WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            ps.setObject(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean delete(String id){
        String sql ="DELETE FROM SanPham WHERE Id =?";
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
        String sql ="SELECT Ma FROM SanPham WHERE Ma =?";
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
    public SanPham getId(String ma){
        String sql ="SELECT Id,Ma,Ten FROM SanPham WHERE Ma =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 SanPham sp = new SanPham(rs.getString(1),rs.getString(2),rs.getString(3));
                 return sp;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
    public SanPham getIdByTen(String ten){
        String sql ="SELECT Id FROM SanPham WHERE Ten =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 SanPham sp = new SanPham(rs.getString(1));
                 return sp;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
    public static void main(String[] args) {
//        List<SanPham> list = new SanPhamRepository().getAll();
//        for (SanPham x : list) {
//            System.out.println(x.toString());
//        }
        System.out.println(new SanPhamRepository().getId("SP3"));
    }
}
