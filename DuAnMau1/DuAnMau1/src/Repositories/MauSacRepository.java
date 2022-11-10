/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import DomainModels.NSX;
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
public class MauSacRepository {
     public List<MauSac> getAll(){
        String sql = "select Id,Ma,Ten from MauSac";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            
            List<MauSac> list = new ArrayList<>();
            
            while (rs.next()) {                
                list.add(new MauSac(rs.getString(1), rs.getString(2),rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean add(MauSac ms){
        String sql = "INSERT INTO MauSac (Ma,Ten) VALUES(?,?)";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
              e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean update(MauSac ms,String id){
        String sql ="UPDATE MauSac SET Ma =?,Ten =? WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            ps.setObject(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
     public boolean delete(String id){
        String sql ="DELETE FROM MauSac WHERE Id =?";
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
        String sql ="SELECT Ma FROM MauSac WHERE Ma =?";
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
     public MauSac getIdByTen(String ten){
        String sql ="SELECT Id FROM MauSac WHERE Ten =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {                 
                 MauSac ms = new MauSac(rs.getString(1));
                 return ms;
             }
            
        } catch (Exception e) {
        }
         return null;
    }
}
