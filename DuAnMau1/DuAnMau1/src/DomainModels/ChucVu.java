/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Diệm DZ
 */
public class ChucVu {
    private String iD;
    private String ma;
    private String Ten;

    public ChucVu() {
    }

    public ChucVu(String iD, String ma, String Ten) {
        this.iD = iD;
        this.ma = ma;
        this.Ten = Ten;
    }

    public ChucVu(String ma, String Ten) {
        this.ma = ma;
        this.Ten = Ten;
    }
    
    public ChucVu(String iD) {
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
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
    
    public Object[] toRowData(){
        return new Object[]{iD,ma,Ten};
    }
}
