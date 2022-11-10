/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.DongSp;
import DomainModels.MauSac;
import Repositories.MauSacRepository;
import Services.ServiceMauSac;
import ViewModels.QLByMa;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceMauSacImpl implements ServiceMauSac{
    private MauSacRepository ql = new MauSacRepository();
    @Override
    public List<MauSac> getAllMauSac() {
        return ql.getAll();
    }

    @Override
    public String add(MauSac ms) {
        QLByMa ma = ql.checkTrung(ms.getMa());
        if(ma != null){
            return "trùng mã";
        }
        boolean add = ql.add(ms);
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
    public String update(MauSac ms,String id) {
        boolean update = ql.update(ms, id);
        if(update){
            return "cập nhật thành công";
        }else{
            return "cập nhật thất bại";
        }
    }

    @Override
    public MauSac getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }

  

}
