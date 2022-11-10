/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.KhachHang;
import Repositories.KhachHangRepository;
import Services.ServiceKhachHang;
import ViewModels.KhachHangViewModels;
import ViewModels.QLByMa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diệm DZ
 */
public class ServiceKhachHangImpl implements ServiceKhachHang{
    private KhachHangRepository ql = new KhachHangRepository();
    @Override
    public List<KhachHangViewModels> getAll() {
        return ql.getAll();
    }

    @Override
    public String add(KhachHang kh) {
        QLByMa ma = ql.checkTrung(kh.getMa());
        if(ma != null){
            return "trùng mã";
        }
        if(kh.getDiaChi().isEmpty() || kh.getHo().isEmpty() || kh.getMa().isEmpty() || kh.getMatKhau().isEmpty() || kh.getQuocGia().isEmpty()
                || kh.getSoDienThoai().isEmpty() || kh.getTen().isEmpty() || kh.getTenDem().isEmpty() || kh.getThanhPho().isEmpty()){
            return "Điền đủ thông tin";
        }
        if(kh.getMa().matches("KH+[0-9]{3}+") == false){
            return "ma khong dung đinh dang";
        }
        
        if(kh.getSoDienThoai().matches("[09|03|07|08|05]+[0-9]{8}+") == false){
            return "so dien thoai không đúng định dạng";
        }
        boolean add = ql.add(kh);
        if(add){
            return "thêm thành công";
        }else{
            return "thêm thất bại";
        }
    }

    @Override
    public String update(KhachHang kh, String id) {
         boolean update = ql.update(kh,id);
        if(update){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
         boolean delete = ql.delete(id);
        if(delete){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public KhachHang getByMa(String ma) {
        return ql.getByMa(ma);
    }

    @Override
    public List<KhachHangViewModels> searchByMa(List<KhachHangViewModels> list,String ma) {
        return ql.SearchByMa(ma);
    }

    @Override
    public KhachHang getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }
    
}
