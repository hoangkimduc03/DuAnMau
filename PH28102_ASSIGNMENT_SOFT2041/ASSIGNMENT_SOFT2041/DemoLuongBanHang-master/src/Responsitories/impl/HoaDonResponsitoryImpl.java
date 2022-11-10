/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories.impl;

import DomainModels.HoaDon;
import Responsitories.HoaDonResponsitory;
import Utilities.DBConnection;
import ViewModels.HoaDonResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HoaDonResponsitoryImpl implements HoaDonResponsitory {

    @Override
    public List<HoaDonResponse> getAll() {
        String query = """
                       SELECT dbo.HoaDon.Id, dbo.HoaDon.Ma, dbo.HoaDon.NgayTao, dbo.NhanVien.Ten, dbo.HoaDon.TenNguoiNhan, dbo.HoaDon.DiaChi, dbo.HoaDon.Sdt, dbo.HoaDon.TinhTrang
                                                            FROM   dbo.HoaDon INNER JOIN
                                                                         dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id AND dbo.HoaDon.IdNV = dbo.NhanVien.Id AND dbo.HoaDon.IdNV = dbo.NhanVien.Id AND dbo.HoaDon.IdNV = dbo.NhanVien.Id AND dbo.HoaDon.IdNV = dbo.NhanVien.Id AND dbo.HoaDon.IdNV = dbo.NhanVien.Id
                       
                       """;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonResponse> listHoaDons = new ArrayList<>();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                listHoaDons.add(hoaDonResponse);
            }
            return listHoaDons;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public HoaDon getOne(String id) {
        String query = """
                        SELECT [Id]
                              
                              ,[NgayTao]
                          
                              
                              ,[TenNguoiNhan]
                              ,[DiaChi]
                              ,[Sdt]
                       ,[TinhTrang]
                          FROM [dbo].[HoaDon]
                        WHERE id = ?
                       """;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HoaDon hoaDon = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                return hoaDon;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean addHoaDon(HoaDon hoaDon) {
        int check = 0;
        String query = "INSERT INTO [dbo].[HoaDon]\n" +

"           ([NgayTao]\n" +
"           ,[TenNguoiNhan]\n" +
"           ,[DiaChi]\n" +
"           ,[Sdt]\n" +
"           ,[TinhTrang] )\n" +
"     VALUES (?,?,?,?,?)";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, new Date());
            ps.setObject(2, hoaDon.getTenNguoiNhan());
            ps.setObject(3, hoaDon.getDiaChi());
            ps.setObject(4, hoaDon.getSdt());
            ps.setObject(5, 0);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean updateHoaDon(String id, HoaDon hoaDon) {
        int check = 0;
        String query = """
                      UPDATE [dbo].[HoaDon]
                          SET 
                             
                             [TenNguoiNhan] = ?
                             ,[DiaChi] = ?
                             ,[Sdt] = ?
                        ,[TinhTrang] = 1
                       WHERE id= ?;
                       """;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getTenNguoiNhan());
            ps.setObject(2, hoaDon.getDiaChi());
            ps.setObject(3, hoaDon.getSdt());
            ps.setObject(4, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
