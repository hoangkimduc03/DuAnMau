/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import Services.ServiceNhanvien;
import ViewModels.NHanVienViewModels;
import ViewModels.QLByMa;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceNhanVienImpl implements ServiceNhanvien{
    private NhanVienRepository ql = new NhanVienRepository();
    @Override
    public List<NHanVienViewModels> getAll() {
        return ql.getAll();
    }

    @Override
    public NhanVien getById(String id) {
        return ql.getById(id);
    }

    @Override
    public String add(NhanVien nv) {
        QLByMa ma = ql.checkTrung(nv.getMa());
        if(ma != null){
            return "trùng mã";
        }
        boolean add = ql.add(nv);
        if(add){
            return "thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(NhanVien nv, String id) {
        boolean update = ql.update(nv,id);
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
    public List<NHanVienViewModels> getByMa(List<NHanVienViewModels> list, String ma) {
        return ql.getByMa(ma);
    }

    @Override
    public NhanVien getCHCV(String id) {
        return ql.getCHCV(id);
    }

    @Override
    public NhanVien getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }
    
}
