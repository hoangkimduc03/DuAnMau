/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.GioHangChiTiet;
import Repositories.GHCTRepository;
import Services.GHCTservice;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class GHCTserviceImpl implements GHCTservice{
    private GHCTRepository ql = new GHCTRepository();
    @Override
    public List<GioHangChiTiet> getAll() {
        return ql.getAll();
    }

    @Override
    public String add(GioHangChiTiet ghct) {
        boolean add = ql.add(ghct);
        if(add){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String delete(String idGh) {
        boolean delete = ql.delete(idGh);
        if(delete){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }
    
}
