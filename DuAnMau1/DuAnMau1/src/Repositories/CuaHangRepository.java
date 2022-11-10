/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
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
public class CuaHangRepository {
    public List<CuaHang> getAll(){
        String sql = "SeLECT Id,Ma,Ten,DiaChi,ThanhPho,QuocGia FROM CuaHang";
        
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ResultSet rs = ps.executeQuery();
             List<CuaHang> list = new ArrayList<>();
             while (rs.next()) {                 
                 list.add(new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)));
             }
             return list;
         } catch (Exception e) {
         }
         return null;
    }
     public boolean add(CuaHang ch){
         String sql = "INSERT INTO CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) VALUES(?,?,?,?,?)";
        int check = 0;
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ch.getMa());
             ps.setObject(2, ch.getTen());
             ps.setObject(3, ch.getDiaChi());
             ps.setObject(4, ch.getThanhPho());
             ps.setObject(5, ch.getQuocGia());
             check= ps.executeUpdate();
         } catch (Exception e) {
         }
         return check >0;
     }
     public boolean update(CuaHang ch,String id){
         String sql = "UPDATE CuaHang SET Ma =?,Ten=?,DiaChi=?,ThanhPho=?,QuocGia=? WHERE Id = ?";
        int check = 0;
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ch.getMa());
             ps.setObject(2, ch.getTen());
             ps.setObject(3, ch.getDiaChi());
             ps.setObject(4, ch.getThanhPho());
             ps.setObject(5, ch.getQuocGia());
             ps.setObject(6, id);
             check= ps.executeUpdate();
         } catch (Exception e) {
         }
         return check >0;
     }
     public boolean delete(String id){
         String sql = "DELETE FROM CuaHang WHERE Id = ?";
        int check = 0;
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, id);
             check= ps.executeUpdate();
         } catch (Exception e) {
         }
         return check >0;
     }
    public CuaHang getIdByTen(String ten){
        String sql = "SeLECT Id FROM CuaHang WHERE Ten=?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setObject(1, ten);
             ResultSet rs = ps.executeQuery();
            
             while (rs.next()) {  
                 CuaHang ch = new CuaHang(rs.getString(1));
                 return ch;
             }
             
         } catch (Exception e) {
         }
        return null;
    }
    public List<CuaHang> search(String ma){
        String sql = "SeLECT Id,Ma,Ten,DiaChi,ThanhPho,QuocGia FROM CuaHang WHERE Ma =?";
        
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ma);
             ResultSet rs = ps.executeQuery();
             List<CuaHang> list = new ArrayList<>();
             while (rs.next()) {                 
                 list.add(new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)));
             }
             return list;
         } catch (Exception e) {
         }
         return null;
    }
    public static void main(String[] args) {
        System.out.println( new CuaHangRepository().search("CH1"));
    }
}
