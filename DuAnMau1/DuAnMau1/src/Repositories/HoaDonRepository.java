/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import DomainModels.KhachHang;

import DomainModels.NhanVien;
import Utilities.DBConnection;
import ViewModels.HoaDonBanHangViewModels;
import ViewModels.HoaDonViewModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Diệm DZ
 */
public class HoaDonRepository {

    public boolean saveHoaDon(HoaDon hd) {
        String sql = "insert into HoaDon(IdNV,Ma,NgayTao,TinhTrang) values(?,?,?,?)";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hd.getNhanVien().getiD());
            ps.setObject(2, hd.getMa());
            ps.setObject(3, hd.getNgayTao());
            ps.setObject(4, hd.getTinhTrang());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<HoaDonBanHangViewModels> getHoaDon() {
        String sql = "select hd.Ma,NgayTao,Ho +' '+TenDem+' '+Ten,TinhTrang from HoaDon hd\n"
                + "inner join NhanVien nv\n"
                + "on hd.IdNV = nv.Id";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonBanHangViewModels> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new HoaDonBanHangViewModels(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getInt(4)));

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean updateTinhTrang(HoaDonBanHangViewModels hd, String id) {
        String sql = "UPDATE HoaDon SET TinhTrang =? WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hd.getTinhTrang());

            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public HoaDonBanHangViewModels getIdByMa(String ma) {
        String sql = "SELECT Id FROM HoaDon WHERE Ma =?";

        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonBanHangViewModels hd = new HoaDonBanHangViewModels(rs.getString(1));
                return hd;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDonViewModel> getAll() {
        String sql = "SELECT Ma,NgayTao,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt FROM HoaDon";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonViewModel> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new HoaDonViewModel(rs.getString(1), rs.getDate(2), rs.getDate(3), rs.getDate(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8)));

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean addHoaDon(HoaDon hd) {
        String sql = "insert into HoaDon(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt) VAlUES(?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hd.getKhachHang().getiD());
            ps.setObject(2, hd.getNhanVien().getiD());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getNgayShip());
            ps.setObject(7, hd.getNgayNhan());
            ps.setObject(8, hd.getTinhTrang());
            ps.setObject(9, hd.getTenNguoiNhan());
            ps.setObject(10, hd.getDiaChi());
            ps.setObject(11, hd.getSoDienThoai());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateHoaDon(HoaDon hd, String id) {
        String sql = "UPDATE HoaDon SET IdKH=?,IdNV=?,Ma=?,NgayTao=?,NgayThanhToan=?,NgayShip=?,NgayNhan=?,TinhTrang=?,TenNguoiNhan=?,DiaChi=?,Sdt=? WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hd.getKhachHang().getiD());
            ps.setObject(2, hd.getNhanVien().getiD());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getNgayShip());
            ps.setObject(7, hd.getNgayNhan());
            ps.setObject(8, hd.getTinhTrang());
            ps.setObject(9, hd.getTenNguoiNhan());
            ps.setObject(10, hd.getDiaChi());
            ps.setObject(11, hd.getSoDienThoai());
            ps.setObject(12, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean deleteHoaDon(String id) {
        String sql = "DELETE FROM HoaDon WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public HoaDon getHKNV(String ma) {
        String sql = "SELECT hd.Id,nv.Ho+' '+nv.TenDem +' '+nv.Ten,kh.Ho+' ' +kh.TenDem +' '+kh.Ten,NgayTao,NgayThanhToan FROM HoaDon hd\n"
                + "inner join KhachHang kh\n"
                + "on hd.IdKH = kh.Id\n"
                + "inner join NhanVien nv\n"
                + "on hd.IdNV = nv.Id\n"
                + "WHERE hd.Ma = ?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), new NhanVien(rs.getString(2)), new KhachHang(rs.getString(3)), rs.getDate(4), rs.getDate(5));
                return hd;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    private String genMa() {
        List<Integer> list = new ArrayList<>();
        String a = null;
        for (int i = 1; i < list.size(); i++) {
            a = "HD" + i++;
        };
//        String a ="HD" + Random.class.toString();
//        Random random = new Random();
//        String a = "HD" + random.nextInt(100);
//        return a;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new HoaDonRepository().genMa());

//        System.out.println(new HoaDonRepository().saveHoaDon(new HoaDon(new NhanVien("DCE777B1-4F07-45B7-9A8E-3D14175E165B"), "Hd2", new Date(2022-10-13), 0)));
    }
}
