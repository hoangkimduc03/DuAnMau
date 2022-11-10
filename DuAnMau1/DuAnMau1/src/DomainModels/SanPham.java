/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Diệm DZ
 */
public class SanPham {
    private String iD;
    private String ma;
    private String ten;

    public SanPham() {
    }

    public SanPham(String iD, String ma, String ten) {
        this.iD = iD;
        this.ma = ma;
        this.ten = ten;
    }

    public SanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public SanPham(String iD) {
        this.iD = iD;
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

    @Override
    public String toString() {
        return "SanPham{" + "iD=" + iD + ", ma=" + ma + ", ten=" + ten + '}';
    }
    
    public  Object[] toRowData(){
        return new Object[]{iD,ma,ten};
    }
}
