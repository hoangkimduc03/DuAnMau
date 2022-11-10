/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author Diệm DZ
 */
public class KhachHangViewModels {
    private String ma;
    private String ten;
    private Date ngaySinh;
    private String soDienThoai;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    public KhachHangViewModels() {
    }

    public KhachHangViewModels(String ma, String ten, Date ngaySinh, String soDienThoai, String diaChi, String thanhPho, String quocGia) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
      
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    

    
    
    public Object [] toRowData(){
        return new Object[]{ma,ten,ngaySinh,soDienThoai,diaChi,thanhPho,quocGia};
    }

    @Override
    public String toString() {
        return "KhachHangViewModels{" + "ma=" + ma + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", thanhPho=" + thanhPho + ", quocGia=" + quocGia + '}';
    }
    
    
}
