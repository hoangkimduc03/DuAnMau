/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.DongSp;
import DomainModels.SanPham;
import Repositories.DongSpRepository;
import Repositories.SanPhamRepository;
import Services.ServiceDongSp;

import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceDongSpImpl implements ServiceDongSp{
     private DongSpRepository ql = new DongSpRepository();
    
    @Override
    public List<DongSp> getAllDongSp() {
        return ql.getAll();
    }

    @Override
    public String add(DongSp sp) {
        SanPham ma = ql.checkTrung(sp.getMa());
        if(ma != null){
            return "trùng mã";
        }
        boolean add = ql.add(sp);
        if(add){
            return "thêm thành công";
        }else{
            return "thêm thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = ql.delete(id);
        if(delete){
            return "xóa thành công";
        }else{
            return "xóa thất bại";
        }
    }

    @Override
    public String update(DongSp sp, String id) {
        boolean update = ql.update(sp, id);
        if(update){
            return "cập nhật thành công";
        }else{
            return "cập nhật thất bại";
        }
    }

    @Override
    public DongSp getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }

  

}
