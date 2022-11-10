/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
import DomainModels.HoaDon;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Utilities.DBConnection;
import ViewModels.GioHangViewModels;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Diệm DZ
 */
public class GioHangRepository {

    public List<GioHangViewModels> getAll() {
        String sql = "SELECT Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang FROM GioHang";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<GioHangViewModels> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new GioHangViewModels(rs.getString(1), rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean add(GioHang gh) {
        String sql = "INSERT INTO GioHang(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang)VALUES(?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, gh.getKhachHang().getiD());
            ps.setObject(2, gh.getNhanVien().getiD());
            ps.setObject(3, gh.getMa());
            ps.setObject(4, gh.getNgayTao());
            ps.setObject(5, gh.getNgayThanhToan());
            ps.setObject(6, gh.getTenNguoiNhan());
            ps.setObject(7, gh.getDiaChi());
            ps.setObject(8, gh.getSoDienthoai());
            ps.setObject(9, gh.getTrangThai());
            check = ps.executeUpdate();

        } catch (Exception e) {
        }
        return check > 0;
    }

    public boolean update(GioHang gh, String id) {
        String sql = "UPDATE  GioHang SET IdKH=?,IdNV=?,Ma=?,NgayTao=?,NgayThanhToan=?,TenNguoiNhan=?,DiaChi=?,Sdt=?,TinhTrang=? WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, gh.getKhachHang().getiD());
            ps.setObject(2, gh.getNhanVien().getiD());
            ps.setObject(3, gh.getMa());
            ps.setObject(4, gh.getNgayTao());
            ps.setObject(5, gh.getNgayThanhToan());
            ps.setObject(6, gh.getTenNguoiNhan());
            ps.setObject(7, gh.getDiaChi());
            ps.setObject(8, gh.getSoDienthoai());
            ps.setObject(9, gh.getTrangThai());
            ps.setObject(10, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String sql = "DELETE FROM GioHang  WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
        }
        return check > 0;
    }

    public GioHang getID(String ma) {
        String sql = "SELECT gh.Id,kh.Ho+' '+ kh.TenDem +' '+ kh.Ten,nv.Ho+' '+ nv.TenDem +' '+ nv.Ten FROM GioHang gh\n"
                + "inner join KhachHang kh\n"
                + "on gh.IdKH = kh.Id\n"
                + "inner join NhanVien nv\n"
                + "on gh.IdNV = nv.Id\n"
                + "WHERE gh.Ma = ?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GioHang gh = new GioHang(rs.getString(1), new KhachHang(rs.getString(2)), new NhanVien(rs.getString(3)));
                return gh;
            }

        } catch (Exception e) {
        }
        return null;
    }
     public List<GioHangViewModels> search(String ma) {
        String sql = "SELECT Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang FROM GioHang WHERE Ma =?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            List<GioHangViewModels> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new GioHangViewModels(rs.getString(1), rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(new GioHangRepository().getID("GH1"));
    }
}
