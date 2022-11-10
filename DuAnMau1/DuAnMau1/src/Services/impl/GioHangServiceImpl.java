/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.GioHang;
import Repositories.GioHangRepository;
import Services.GioHangService;
import ViewModels.GioHangViewModels;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class GioHangServiceImpl implements GioHangService{
    private GioHangRepository gioHangRepository = new GioHangRepository();

    @Override
    public List<GioHangViewModels> getAll() {
        return gioHangRepository.getAll();
    }

    @Override
    public String add(GioHang gh) {
        boolean add = gioHangRepository.add(gh);
        if(add){
            return "thêm thành công";
        }else{
            return "Thêm thất bại";
    }
    }
    @Override
    public String update(GioHang gh, String id) {
         boolean update = gioHangRepository.update(gh,id);
        if(update){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
    }
    }

    @Override
    public String delete(String id) {
          boolean delete = gioHangRepository.delete(id);
        if(delete){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
    }
    }

    @Override
    public GioHang getId(String ma) {
        return gioHangRepository.getID(ma);
    }

    @Override
    public List<GioHangViewModels> search(List<GioHangViewModels> list, String ma) {
        return gioHangRepository.search(ma);
    }
    
}
