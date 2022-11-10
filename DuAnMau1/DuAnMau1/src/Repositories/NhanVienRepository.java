/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Utilities.DBConnection;
import ViewModels.NHanVienViewModels;
import ViewModels.QLByMa;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Diệm DZ
 */
public class NhanVienRepository {

    public List<NHanVienViewModels> getAll() {
        String sql = "SeLECT Id,Ma,Ho +' '+TenDem +' '+Ten ,GioiTinh,NgaySinh,DiaChi,Sdt,TrangThai FROM NhanVien";

        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<NHanVienViewModels> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new NHanVienViewModels(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public NhanVien getById(String id) {
        String sql = "SELECT Ten,TenDem,Ho,MatKhau,IdCH,IdCV,IdGuiBC FROM NhanVien WHERE Id =?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), new CuaHang(rs.getString(5)), new ChucVu(rs.getString(6)), new NhanVien(rs.getString(7)));
                return nv;
            }

        } catch (Exception e) {
        }
        return null;
    }

    public boolean add(NhanVien nv) {
        String sql = "INSERT INTO NhanVien(Ma,Ten,TenDem,Ho,NgaySinh,GioiTinh,DiaChi,Sdt,MatKhau,IdCH,IdCV,TrangThai)\n"
                + "	VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getTenDem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getNgaySinh());
            ps.setObject(6, nv.getGioiTinh());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.getSoDienThoai());
            ps.setObject(9, nv.getMatKhau());
            ps.setObject(10, nv.getCuaHang().getiD());
            ps.setObject(11, nv.getChucVu().getiD());
            ps.setObject(12, nv.getTrangThai());

            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(NhanVien nv, String id) {
        String sql = "UPDATE NhanVien SET Ma=?,Ten=?,TenDem=?,Ho=?,NgaySinh=?,GioiTinh=?,DiaChi=?,Sdt=?,MatKhau=?,IdCH=?,IdCV=?,TrangThai=? WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getTenDem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getNgaySinh());
            ps.setObject(6, nv.getGioiTinh());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.getSoDienThoai());
            ps.setObject(9, nv.getMatKhau());
            ps.setObject(10, nv.getCuaHang().getiD());
            ps.setObject(11, nv.getChucVu().getiD());
            ps.setObject(12, nv.getTrangThai());
            ps.setObject(13, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String sql = "DELETE FROM NhanVien WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<NHanVienViewModels> getByMa(String ma) {
        String sql = "SeLECT Id,Ma,Ho +' '+TenDem +' '+Ten ,GioiTinh,NgaySinh,DiaChi,Sdt,TrangThai FROM NhanVien WHERE Ma=?";

        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            List<NHanVienViewModels> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new NHanVienViewModels(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public QLByMa checkTrung(String ma) {
        String sql = "SELECT Ma  FROM NhanVien WHERE Ma=?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
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

    public NhanVien getCHCV(String id) {
        String sql = "SELECT nv.Ten,ch.Ten,cv.Ten FROM NhanVien nv\n"
                + "inner join CuaHang ch\n"
                + "on nv.IdCH = ch.Id\n"
                + "inner join ChucVu cv\n"
                + "on nv.IdCV = cv.Id\n"
                + "WHERE nv.Id =?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), new CuaHang(rs.getString(2)), new ChucVu(rs.getString(3)));
                return nv;
            }

        } catch (Exception e) {
        }
        return null;
    }
     public NhanVien getIdByTen(String ten){
        String sql = "SELECT Id FROM NhanVien WHERE Ho+' '+TenDem+' '+Ten =?";
         try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)){
             ps.setObject(1, ten);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {    
                 NhanVien nv = new NhanVien(rs.getString(1));
                 return nv;
             }
             
         } catch (Exception e) {
         }
         return null;
    }
    public static void main(String[] args) {
//      System.out.println( new NhanVienRepository().add(new NhanVien("NV5", "Hoa", "Ngọc", "Phạm", "Nữ",Date.valueOf("1998-09-18")  , "Quảng Ninh", "0971833478", "hoa1998", new CuaHang("081098AD-6B39-43FF-B693-16A9E2DE7EA3"), new ChucVu("C82A997D-EFF7-4375-9F62-E6B7ECBDD2D4"), 0)));
        System.out.println(new NhanVienRepository().getIdByTen("Đinh Khắc Diệm"));
    }
}
