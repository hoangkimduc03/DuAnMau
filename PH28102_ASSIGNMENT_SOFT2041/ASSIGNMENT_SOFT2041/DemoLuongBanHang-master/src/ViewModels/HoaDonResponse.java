/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;


public class HoaDonResponse {

    private String id;
    private String Ma;
    private Date ngayTao;
    private String tenNV;
    private String tenNN;
    private String diaChi;
    private String soDienThoai;
    private int trangThai;

    public HoaDonResponse() {
    }

    public HoaDonResponse(String id, String Ma, Date ngayTao, String tenNV, String tenNN, String diaChi, String soDienThoai, int trangThai) {
        this.id = id;
        this.Ma = Ma;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tenNN = tenNN;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
    }

    public String getTenNN() {
        return tenNN;
    }

    public void setTenNN(String tenNN) {
        this.tenNN = tenNN;
    }

   

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
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

    public Object[] toDataRow() {
        return new Object[]{Ma,ngayTao,tenNV, trangThai == 0 ? "Chờ thanh toán"
            : trangThai == 1 ? "Đã thanh toán" : ""};
    }
    
}
