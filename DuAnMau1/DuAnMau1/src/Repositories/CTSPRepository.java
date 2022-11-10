/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSanPham;
import DomainModels.DongSp;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import Utilities.DBConnection;
import ViewModels.ChiTietSanPhamModels;
import ViewModels.SanPhamBanHangViewModel;

import java.math.BigDecimal;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Diệm DZ
 */
public class CTSPRepository {

    public List<SanPhamBanHangViewModel> getAll() {
        String sql = "select Ma,Ten,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan from ChiTietSP ct\n"
                + "inner join SanPham sp \n"
                + "on ct.IdSP = sp.Id";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();

            List<SanPhamBanHangViewModel> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new SanPhamBanHangViewModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getBigDecimal(6), rs.getDouble(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public List<ChiTietSanPhamModels> getAllSanPham() {
        String sql = "select ct.Id,sp.Id,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan from ChiTietSP ct\n"
                + "inner join SanPham sp \n"
                + "on ct.IdSP = sp.Id";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();

            List<ChiTietSanPhamModels> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new ChiTietSanPhamModels(rs.getString(1), new SanPham(rs.getString(2)), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getBigDecimal(6), rs.getBigDecimal(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean add(ChiTietSanPham ct) {
        String sql = "INSERT INTO ChiTietSP(IdSP,IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) VALUES(?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ct.getSanPham().getiD());
            ps.setObject(2, ct.getNsx().getiD());
            ps.setObject(3, ct.getMauSac().getiD());
            ps.setObject(4, ct.getDongSp().getiD());
            ps.setObject(5, ct.getNamBaoHanh());
            ps.setObject(6, ct.getMoTa());
            ps.setObject(7, ct.getSoLuong());
            ps.setObject(8, ct.getGiaNhap());
            ps.setObject(9, ct.getGiaBan());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ChiTietSanPham ct, String Id) {
        String sql = "UPDATE ChiTietSP SET IdSP=?,IdNsx=?,IdMauSac=?,IdDongSP=?,NamBH=?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=? WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ct.getSanPham().getiD());
            ps.setObject(2, ct.getNsx().getiD());
            ps.setObject(3, ct.getMauSac().getiD());
            ps.setObject(4, ct.getDongSp().getiD());
            ps.setObject(5, ct.getNamBaoHanh());
            ps.setObject(6, ct.getMoTa());
            ps.setObject(7, ct.getSoLuong());
            ps.setObject(8, ct.getGiaNhap());
            ps.setObject(9, ct.getGiaBan());
            ps.setObject(10, Id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateSoLuong(ChiTietSanPham ct, String Id) {
        String sql = "UPDATE ChiTietSP SET SoLuongTon=? WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ct.getSoLuong());
            ps.setObject(2, Id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public ChiTietSanPham getID(String id) {
        String query = "SELECT  sp.Ten,nsx.Ten,ms.Ten,dsp.Ten FROM ChiTietSP ctsp\n"
                + "inner join NSX nsx\n"
                + "on ctsp.IdNsx = nsx.Id\n"
                + "inner join MauSac ms\n"
                + "on ctsp.IdMauSac = ms.Id\n"
                + "inner join DongSP dsp\n"
                + "on ctsp.IdDongSP = dsp.Id \n"
                + "inner join SanPham sp\n"
                + "on ctsp.IdSP = sp.Id \n"
                + "WHERE ctsp.Id =?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietSanPham ct = new ChiTietSanPham(new SanPham(rs.getString(1)),new NSX(rs.getString(2)), new MauSac(rs.getString(3)), new DongSp(rs.getString(4)));
                return ct;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public ChiTietSanPham getIDByIDSP(String id) {
        String query = "SELECT Id FROM ChiTietSP WHERE IdSP =?";
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietSanPham ct = new ChiTietSanPham(rs.getString(1));
                return ct;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public boolean delete(String Id) {
        String sql = "DELETE FROM ChiTietSP  WHERE Id =?";
        int check = 0;
        try (Connection con = new DBConnection().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, Id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        System.out.println(new CTSPRepository().getID("F9859E14-DB07-47B0-BA15-22326581DF87"));
    }
}
