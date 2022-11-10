/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSanPham;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Diệm DZ
 */
public class HoaDonChiTietRepository {
    
    public boolean saveHDCT(HoaDonChiTiet hdct){
        String sql ="INSERT INTO HoaDonChiTiet(IdHoaDon,IdChiTietSP,DonGia,SoLuong) VALUES(?,?,?,?)";
         int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hdct.getHoaDon().getiD());
            ps.setObject(2, hdct.getChiTietSanPham().getiD());
            ps.setObject(3, hdct.getDonGia());
            ps.setObject(4, hdct.getSoLuong());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    public List<HoaDonChiTiet> getAll(){
        String sql =" SELECT IdHoaDon,IdChiTietSP,SoLuong,DonGia FROM HoaDonChiTiet ";
        
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonChiTiet> list = new ArrayList<>();
            while (rs.next()) {                
                list.add(new HoaDonChiTiet(new HoaDon(rs.getString(1)), new ChiTietSanPham(rs.getString(2)), rs.getInt(3), rs.getDouble(4)));
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public boolean delete(String id){
          String sql =" DELETE FROM HoaDonChiTiet WHERE IdHoaDon =? ";
         int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();           
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
    public HoaDonChiTietRepository() {
    }
    public static void main(String[] args) {
        List<HoaDonChiTiet> list = new HoaDonChiTietRepository().getAll();
        for (HoaDonChiTiet hoaDonChiTiet : list) {
            System.out.println(hoaDonChiTiet.toString());
        }
//        System.out.println( new HoaDonChiTietRepository().getAll());
    }
}
