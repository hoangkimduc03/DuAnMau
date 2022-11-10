/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories.impl;

import Responsitories.HoaDonChiTietResponsitory;
import Utilities.DBConnection;
import ViewModels.HoaDonChiTietResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class HoaDonChiTietResponsitoryImpl implements HoaDonChiTietResponsitory {

    @Override
    public List<HoaDonChiTietResponse> getAllByHoaDonID() {
        String query = """
                        SELECT dbo.HoaDonChiTiet.IdHoaDon, dbo.HoaDonChiTiet.IdChiTietSP, dbo.SanPham.Ten, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaBan
                                        FROM   dbo.HoaDonChiTiet INNER JOIN
                                                     dbo.ChiTietSP ON dbo.HoaDonChiTiet.IdChiTietSP = dbo.ChiTietSP.Id INNER JOIN
                                                     dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id AND dbo.ChiTietSP.IdSP = dbo.SanPham.Id AND dbo.ChiTietSP.IdSP = dbo.SanPham.Id AND dbo.ChiTietSP.IdSP = dbo.SanPham.Id AND dbo.ChiTietSP.IdSP = dbo.SanPham.Id INNER JOIN
                                                     dbo.HoaDon ON dbo.HoaDonChiTiet.IdHoaDon = dbo.HoaDon.Id      
                       """;
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
           
            ResultSet rs = ps.executeQuery();
            List<HoaDonChiTietResponse> listHoaDonChiTiets = new ArrayList<>();
            while (rs.next()) {
                HoaDonChiTietResponse hoaDonChiTietResponse
                        = new HoaDonChiTietResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5));
                listHoaDonChiTiets.add(hoaDonChiTietResponse);
            }
            return listHoaDonChiTiets;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean addListOrder(String hoaDonID, List<HoaDonChiTietResponse> lists) {
        String query = """
                       INSERT INTO [dbo].[HoaDonChiTiet]
                                  ([IdHoaDon]
                                  ,[IdChiTietSP]
                                  ,[SoLuong]
                                  ,[DonGia])
                            
                       VALUES(?,?,?,?);
                       """;

        int[] arr = {};
        try (Connection con = DBConnection.getConnection(); // mở kết nối đến DB
                PreparedStatement ps = (con != null) ? con.prepareStatement(query) : null;) {
            if (ps != null) {
                for (HoaDonChiTietResponse hoaDonChiTiet : lists) {
                    ps.setObject(1, hoaDonChiTiet.getHoaDonID());
                    ps.setObject(2, hoaDonChiTiet.getSanPhamID());
                    ps.setObject(3, hoaDonChiTiet.getSoLuong());
                    ps.setObject(4, hoaDonChiTiet.getDonGia());
                    //batch update
                    ps.addBatch();
                }
                arr = ps.executeBatch();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return arr.length > 0;
    }


}
