/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.DBConnection;
import ViewModels.KhachHangViewModels;
import ViewModels.NHanVienViewModels;
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
public class KhachHangRepository {
    
    public List<KhachHangViewModels> getAll(){
        String sql = "SELECT Ma,Ho +' '+ TenDem +' '+ Ten,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia FROM KhachHang";
        
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ResultSet rs = ps.executeQuery();
             List<KhachHangViewModels> list = new ArrayList<>();
             while (rs.next()) {                 
                 list.add(new KhachHangViewModels(rs.getString(1), rs.getString(2), rs.getDate(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
             }
             return list;
         } catch (Exception e) {
         }
         return null;
    }
    
    public KhachHang getByMa(String ma){
        String sql = "SELECT Id,Ten,TenDem,Ho,MatKhau FROM KhachHang WHERE Ma=?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ma);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {    
                 KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                 return kh;
             }
             
         } catch (Exception e) {
         }
         return null;
    }
    public boolean add(KhachHang kh){
        String sql ="INSERT INTO KhachHang(Ma,Ten,TenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau) VALUES(?,?,?,?,?,?,?,?,?,?)";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, kh.getMa());
             ps.setObject(2, kh.getTen());
             ps.setObject(3, kh.getTenDem());
             ps.setObject(4, kh.getHo());
             ps.setObject(5, kh.getNgaySinh());
             ps.setObject(6, kh.getSoDienThoai());
             ps.setObject(7, kh.getDiaChi());
             ps.setObject(8, kh.getThanhPho());
             ps.setObject(9, kh.getQuocGia());
             ps.setObject(10, kh.getMatKhau());
             check = ps.executeUpdate();
         } catch (Exception e) {
             e.printStackTrace(System.out);
         }
         return check>0;
    }
    public boolean update(KhachHang kh,String id){
        String sql ="UPDATE KhachHang SET Ma=?,Ten=?,TenDem=?,Ho=?,NgaySinh=?,Sdt=?,DiaChi=?,ThanhPho=?,QuocGia=?,MatKhau=? WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, kh.getMa());
             ps.setObject(2, kh.getTen());
             ps.setObject(3, kh.getTenDem());
             ps.setObject(4, kh.getHo());
             ps.setObject(5, kh.getNgaySinh());
             ps.setObject(6, kh.getSoDienThoai());
             ps.setObject(7, kh.getDiaChi());
             ps.setObject(8, kh.getThanhPho());
             ps.setObject(9, kh.getQuocGia());
             ps.setObject(10, kh.getMatKhau());
             ps.setObject(11, id);
             check = ps.executeUpdate();
         } catch (Exception e) {
             e.printStackTrace(System.out);
         }
         return check>0;
    }
    public boolean delete(String id){
        String sql ="DELETE FROM KhachHang  WHERE Id =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, id);
             check = ps.executeUpdate();
         } catch (Exception e) {
             e.printStackTrace(System.out);
         }
         return check>0;
    }
    public QLByMa checkTrung(String ma){
        String sql = "SELECT Ma FROM KhachHang WHERE Ma=?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ma);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {    
                 QLByMa kh = new QLByMa(rs.getString(1));
                 return kh;
             }
             
         } catch (Exception e) {
         }
         return null;
    }
    public List<KhachHangViewModels> SearchByMa(String ma){
        String sql = "SELECT Ma,Ho +' '+ TenDem +' '+ Ten,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia FROM KhachHang WHERE Ma=?";
        
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ma);
             ResultSet rs = ps.executeQuery();
             List<KhachHangViewModels> list = new ArrayList<>();
             while (rs.next()) {                 
                 list.add(new KhachHangViewModels(rs.getString(1), rs.getString(2), rs.getDate(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
             }
             return list;
         } catch (Exception e) {
         }
         return null;
    }
    public KhachHang getIdByTen(String ten){
        String sql = "SELECT Id FROM KhachHang WHERE Ho+' '+TenDem+' '+Ten=?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ten);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {    
                 KhachHang kh = new KhachHang(rs.getString(1));
                 return kh;
             }
             
         } catch (Exception e) {
         }
         return null;
    }
    
    public static void main(String[] args) {
        System.out.println(new KhachHangRepository().SearchByMa("KH2"));
    }
}
