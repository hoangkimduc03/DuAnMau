/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.DongSp;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import java.math.BigDecimal;

/**
 *
 * @author Diệm DZ
 */
public class ChiTietSanPhamModels {
     private String iD;
    private SanPham sanPham;
    private int namBaoHanh;
    private String moTa;
    private int soLuong;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public ChiTietSanPhamModels() {
    }

    public ChiTietSanPhamModels(String iD, SanPham sanPham, int namBaoHanh, String moTa, int soLuong, BigDecimal giaNhap, BigDecimal giaBan) {
        this.iD = iD;
        this.sanPham = sanPham;
        this.namBaoHanh = namBaoHanh;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
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

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }


    public  Object[] toRowData(){
        return new Object[]{iD,sanPham.getiD(),namBaoHanh,moTa,soLuong,giaNhap,giaBan};
    }
}
