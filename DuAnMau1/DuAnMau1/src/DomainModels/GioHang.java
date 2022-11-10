/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author Diệm DZ
 */
public class GioHang {
    private String iD;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String ma;
    private Date ngayTao;
    private Date ngayThanhToan;
    private String tenNguoiNhan;
    private  String diaChi;
    private String soDienthoai;
    private int trangThai;

    public GioHang() {
    }

    public GioHang(String iD, KhachHang khachHang, NhanVien nhanVien, String ma, Date ngayTao, Date ngayThanhToan, String tenNguoiNhan, String diaChi, String soDienthoai, int trangThai) {
        this.iD = iD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.soDienthoai = soDienthoai;
        this.trangThai = trangThai;
    }

    public GioHang(KhachHang khachHang, NhanVien nhanVien, String ma, Date ngayTao, Date ngayThanhToan, String tenNguoiNhan, String diaChi, String soDienthoai, int trangThai) {
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.soDienthoai = soDienthoai;
        this.trangThai = trangThai;
    }
    
    public GioHang(String iD) {
        this.iD = iD;
    }

    public GioHang(String iD, KhachHang khachHang, NhanVien nhanVien) {
        this.iD = iD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }
    
    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienthoai() {
        return soDienthoai;
    }

    public void setSoDienthoai(String soDienthoai) {
        this.soDienthoai = soDienthoai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "GioHang{" + "iD=" + iD + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", ma=" + ma + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tenNguoiNhan=" + tenNguoiNhan + ", diaChi=" + diaChi + ", soDienthoai=" + soDienthoai + ", trangThai=" + trangThai + '}';
    }
    
    
}
