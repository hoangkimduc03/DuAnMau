/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.MauSac;
import DomainModels.NSX;
import Repositories.MauSacRepository;
import Repositories.NSXRepository;
import ViewModels.QLByMa;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceNSXImpl implements Services.ServiceNSX{
     private NSXRepository ql = new NSXRepository();
    @Override
    public List<NSX> getAllNSX() {
        return ql.getAll();
    }

    @Override
    public String add(NSX nsx) {
        QLByMa ma = ql.checkTrung(nsx.getMa());
        if(ma != null){
            return "trùng mã";
        }
        boolean add = ql.add(nsx);
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
    public String update(NSX nsx,String id) {
        boolean update = ql.update(nsx, id);
        if(update){
            return "cập nhật thành công";
        }else{
            return "cập nhật thất bại";
        }
    }

    @Override
    public NSX getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }
}
