/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author Diệm DZ
 */
public class SanPhamBanHangViewModel {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private String moTa;
    private int soLuong;
    private BigDecimal giaNhap;
    private double giaBan;
    
    
    public SanPhamBanHangViewModel() {
    }

    public SanPhamBanHangViewModel(String ma, String ten, int namBaoHanh, String moTa, int soLuong, BigDecimal giaNhap, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.namBaoHanh = namBaoHanh;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "QLChiTietsanPham{" + "ma=" + ma + ", ten=" + ten + ", namBaoHanh=" + namBaoHanh + ", moTa=" + moTa + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }
    
    
}
