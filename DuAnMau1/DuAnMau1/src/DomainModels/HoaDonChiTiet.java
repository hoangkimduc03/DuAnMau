/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author Diệm DZ
 */
public class HoaDonChiTiet {
    private HoaDon hoaDon;
    private ChiTietSanPham chiTietSanPham;
    private int soLuong;
    private double donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(HoaDon hoaDon, ChiTietSanPham chiTietSanPham, int soLuong, double donGia) {
        this.hoaDon = hoaDon;
        this.chiTietSanPham = chiTietSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDonChiTiet(HoaDon hoaDon, int soLuong, double donGia) {
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietSanPham getChiTietSanPham() {
        return chiTietSanPham;
    }

    public void setChiTietSanPham(ChiTietSanPham chiTietSanPham) {
        this.chiTietSanPham = chiTietSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "hoaDon=" + hoaDon + ", chiTietSanPham=" + chiTietSanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{hoaDon.getiD(),chiTietSanPham.getiD(),soLuong,donGia};
    }
}
