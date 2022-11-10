/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author hangnt
 */
public class HoaDon {

    private String Id;
    private String IdKH;
    private String IdNV;
    private String Ma;
    private String NgayTao;
    private String NgayThanhToan;
    private String NgayShip ;
    private String NgayNhan;
    private int TinhTrang;
    private String TenNguoiNhan ;
    private String DiaChi ;
    private String Sdt ;


    public HoaDon() {
    }

    public HoaDon(String TenNguoiNhan, String DiaChi, String Sdt) {
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }

    public HoaDon(String Id, String IdKH, String IdNV, String Ma, String NgayTao, String NgayThanhToan, String NgayShip, String NgayNhan, int TinhTrang, String TenNguoiNhan, String DiaChi, String Sdt) {
        this.Id = Id;
        this.IdKH = IdKH;
        this.IdNV = IdNV;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.NgayShip = NgayShip;
        this.NgayNhan = NgayNhan;
        this.TinhTrang = TinhTrang;
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }

    public HoaDon(String Id, String NgayTao,String TenNguoiNhan, String DiaChi, String Sdt, int TinhTrang) {
        this.Id = Id;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdKH() {
        return IdKH;
    }

    public void setIdKH(String IdKH) {
        this.IdKH = IdKH;
    }

    public String getIdNV() {
        return IdNV;
    }

    public void setIdNV(String IdNV) {
        this.IdNV = IdNV;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public String getNgayShip() {
        return NgayShip;
    }

    public void setNgayShip(String NgayShip) {
        this.NgayShip = NgayShip;
    }

    public String getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(String NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

   
    

}
