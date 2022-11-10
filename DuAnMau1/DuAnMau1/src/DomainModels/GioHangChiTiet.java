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
public class GioHangChiTiet {
    private GioHang gioHang;
    private ChiTietSanPham chiTietSanPham;
    private int soLuong;
    private double donGia;
    private double dongiaKhiGiam;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(GioHang gioHang, ChiTietSanPham chiTietSanPham, int soLuong, double donGia, double dongiaKhiGiam) {
        this.gioHang = gioHang;
        this.chiTietSanPham = chiTietSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dongiaKhiGiam = dongiaKhiGiam;
    }

    public GioHangChiTiet(GioHang gioHang, ChiTietSanPham chiTietSanPham, int soLuong, double donGia) {
        this.gioHang = gioHang;
        this.chiTietSanPham = chiTietSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
   
    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
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

    public double getDongiaKhiGiam() {
        return dongiaKhiGiam;
    }

    public void setDongiaKhiGiam(double dongiaKhiGiam) {
        this.dongiaKhiGiam = dongiaKhiGiam;
    }
    public Object[] toRowData(){
        return new Object[]{gioHang.getiD(),chiTietSanPham.getiD(),soLuong,donGia,dongiaKhiGiam};
    }
    
}
