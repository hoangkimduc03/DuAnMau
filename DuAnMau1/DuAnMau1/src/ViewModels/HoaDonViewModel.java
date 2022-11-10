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
public class HoaDonViewModel {
    private String ma;
    private Date ngayTao;
    private Date ngayShip;
    private Date ngayNhan;
    private int trangThai;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String ma, Date ngayTao, Date ngayShip, Date ngayNhan, int trangThai, String tenNguoiNhan, String diaChi, String sdt) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.trangThai = trangThai;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
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

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String tinhTrang(){
        if(trangThai == 0){
            return "Đã thanh toán";
        }else{
             return "Chưa thanh toán";
        }
    }
    public Object [] toRowData(){
        return new Object[]{ma,ngayTao,ngayShip,ngayNhan,tinhTrang(),tenNguoiNhan,diaChi,sdt};
    }
}
