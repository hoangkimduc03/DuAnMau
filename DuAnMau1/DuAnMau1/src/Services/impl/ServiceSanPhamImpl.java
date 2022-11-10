/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.SanPham;
import Repositories.SanPhamRepository;
import Services.ServiceSanPham;
import ViewModels.QLByMa;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceSanPhamImpl implements ServiceSanPham{
    private SanPhamRepository ql = new SanPhamRepository();
    @Override
    public List<SanPham> getAll() {
        return ql.getAll();
    }

    @Override
    public String add(SanPham sp) {
        QLByMa ma = ql.checkTrung(sp.getMa());
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
    public String update(SanPham sp, String id) {
        boolean update = ql.update(sp, id);
        if(update){
            return "cập nhật thành công";
        }else{
            return "cập nhật thất bại";
        }
    }

    @Override
    public SanPham getId(String ma) {
        return ql.getId(ma);
    }

    @Override
    public SanPham getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }
    
}
