/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ChiTietSanPham;
import Repositories.CTSPRepository;
import ViewModels.ChiTietSanPhamModels;
import ViewModels.SanPhamBanHangViewModel;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceCTSPImpl implements Services.ServiceCTSP{
    private CTSPRepository ql = new CTSPRepository();
    @Override
    public List<SanPhamBanHangViewModel> getAll() {
        return ql.getAll();
    }

    @Override
    public List<ChiTietSanPhamModels> getAllSanPham() {
        return ql.getAllSanPham();
    }

    @Override
    public String add(ChiTietSanPham ct) {
        boolean add = ql.add(ct);
        if(add){
            return "Thêm thành công";
        }else{
            return "Thêm Thất bại";
        }
    }

    @Override
    public String update(ChiTietSanPham ct, String id) {
         boolean update = ql.update(ct, id);
        if(update){
            return "sửa thành công";
        }else{
            return "sửa Thất bại";
        }   
    }

    @Override
    public String delete(String id) {
         boolean delete = ql.delete(id);
        if(delete){
            return "xóa thành công";
        }else{
            return "xóa Thất bại";
        }   
    }

    @Override
    public ChiTietSanPham getID(String id) {
        return ql.getID(id);
    }

    @Override
    public ChiTietSanPham getIDByIDSP(String id) {
        return ql.getIDByIDSP(id);
    }

    @Override
    public boolean updateSoLuong(ChiTietSanPham ctsp, String id) {
        return ql.updateSoLuong(ctsp, id);
    }

    
}
