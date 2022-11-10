/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;


import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Diệm DZ
 */
public class ChiTietSanPham {
    private String iD;
    private SanPham sanPham;
    private NSX nsx;
    private MauSac mauSac;
    private DongSp dongSp;
    private int namBaoHanh;
    private String moTa;
    private int soLuong;
    private double giaNhap;
    private double giaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham( SanPham sanPham, NSX nsx, MauSac mauSac, DongSp dongSp, int namBaoHanh, String moTa, int soLuong, double giaNhap, double giaBan) {
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSp = dongSp;
        this.namBaoHanh = namBaoHanh;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSanPham(SanPham sanPham, NSX nsx, MauSac mauSac, DongSp dongSp) {
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSp = dongSp;
    }

   

    public ChiTietSanPham(String iD) {
        this.iD = iD;
    }
    
    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public NSX getNsx() {
        return nsx;
    }

    public void setNsx(NSX nsx) {
        this.nsx = nsx;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public DongSp getDongSp() {
        return dongSp;
    }

    public void setDongSp(DongSp dongSp) {
        this.dongSp = dongSp;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "iD=" + iD + ", sanPham=" + sanPham + ", nsx=" + nsx + ", mauSac=" + mauSac + ", dongSp=" + dongSp + ", namBaoHanh=" + namBaoHanh + ", moTa=" + moTa + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

    
    
}
