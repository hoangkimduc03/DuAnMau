/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSanPham;
import DomainModels.GioHang;
import DomainModels.GioHangChiTiet;
import Utilities.DBConnection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Diệm DZ
 */
public class GHCTRepository {
    public List<GioHangChiTiet> getAll(){
        String sql = "SELECT *FROM GioHangChiTiet";
        try (Connection con = new DBConnection().getConnection();PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            List<GioHangChiTiet> list = new  ArrayList<>();
            while (rs.next()) {                
                list.add(new GioHangChiTiet(new GioHang(rs.getString(1)), new ChiTietSanPham(rs.getString(2)), rs.getInt(3), rs.getDouble(4), rs.getDouble(5)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public boolean add(GioHangChiTiet ghct){
        String sql = "INSERT INTO GioHangChiTiet(IdGioHang,IdChiTietSP,SoLuong,DonGia,DonGiaKhigiam) VALUES(?,?,?,?,?)";
        int check =0;
        try (Connection con = new DBConnection().getConnection();PreparedStatement ps = con.prepareStatement(sql)){
            ps.setObject(1, ghct.getGioHang().getiD());
            ps.setObject(2, ghct.getChiTietSanPham().getiD());
            ps.setObject(3, ghct.getSoLuong());
            ps.setObject(4, ghct.getDonGia());
            ps.setObject(5, ghct.getDongiaKhiGiam());
            
            check = ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return check>0;
    }
    public boolean delete(String idHd){
        String sql = "DELETE FROM GioHangChiTiet WHERE IdGioHang =?";
        int check =0;
        try (Connection con = new DBConnection().getConnection();PreparedStatement ps = con.prepareStatement(sql)){
            ps.setObject(1, idHd);
            check = ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return check>0;
    }
    
}
