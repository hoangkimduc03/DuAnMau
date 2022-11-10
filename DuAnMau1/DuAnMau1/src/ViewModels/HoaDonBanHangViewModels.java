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
public class HoaDonBanHangViewModels {
    private String id;
    private String maHD;
    private Date ngatTao;
    private String tenNV;
    private int tinhTrang;

    public HoaDonBanHangViewModels() {
    }

    public HoaDonBanHangViewModels(String maHD, Date ngatTao, String tenNV, int tinhTrang) {
        this.maHD = maHD;
        this.ngatTao = ngatTao;
        this.tenNV = tenNV;
        this.tinhTrang = tinhTrang;
    }

    public String getMaHD() {
        return maHD;
    }

    public HoaDonBanHangViewModels(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgatTao() {
        return ngatTao;
    }

    public void setNgatTao(Date ngatTao) {
        this.ngatTao = ngatTao;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public String tinhTrang(){
        if(tinhTrang == 0){
            return "Đã thanh toán";
        }else{
            return "Chưa thanh toán";
        }
    }

    @Override
    public String toString() {
        return "HoaDonViewModels{" + "maHD=" + maHD + ", ngatTao=" + ngatTao + ", tenNV=" + tenNV + ", tinhTrang=" + tinhTrang + '}';
    }

   
    
}
