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
public class NhanVien {
    private String iD;
    private String ma;
    private String ten;
    private String TenDem;
    private String ho;
    private String gioiTinh;
    private Date ngaySinh;
    private String  diaChi;
    private String soDienThoai;
    private String matKhau;
    private CuaHang cuaHang;
    private ChucVu chucVu;
    private NhanVien idGuiBC;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String iD, String ma, String ten, String TenDem, String ho, String gioiTinh, Date ngaySinh, String diaChi, String soDienThoai, String matKhau, CuaHang cuaHang, ChucVu chucVu, NhanVien idGuiBC, int trangThai) {
        this.iD = iD;
        this.ma = ma;
        this.ten = ten;
        this.TenDem = TenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.matKhau = matKhau;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.idGuiBC = idGuiBC;
        this.trangThai = trangThai;
    }

    public NhanVien(String ma, String ten, String TenDem, String ho, String gioiTinh, Date ngaySinh, String diaChi, String soDienThoai, String matKhau, CuaHang cuaHang, ChucVu chucVu, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.TenDem = TenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.matKhau = matKhau;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }
    
    public NhanVien(String ten, String TenDem, String ho, String matKhau, CuaHang cuaHang, ChucVu chucVu, NhanVien idGuiBC) {
        this.ten = ten;
        this.TenDem = TenDem;
        this.ho = ho;
        this.matKhau = matKhau;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.idGuiBC = idGuiBC;
    }

    public NhanVien(String ten, CuaHang cuaHang, ChucVu chucVu) {
        this.ten = ten;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
    }
    
    public NhanVien(String iD) {
        this.iD = iD;
    }

    public NhanVien(String ten, String matKhau) {
        this.ten = ten;
        this.matKhau = matKhau;
    }
    
    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
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

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public NhanVien getIdGuiBC() {
        return idGuiBC;
    }

    public void setIdGuiBC(NhanVien idGuiBC) {
        this.idGuiBC = idGuiBC;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "iD=" + iD + ", ma=" + ma + ", ten=" + ten + ", TenDem=" + TenDem + ", ho=" + ho + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", matKhau=" + matKhau + ", cuaHang=" + cuaHang + ", chucVu=" + chucVu + ", idGuiBC=" + idGuiBC + ", trangThai=" + trangThai + '}';
    }
    
   
    

   
    

  
    
    
}
