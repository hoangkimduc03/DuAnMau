/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDon;
import Repositories.HoaDonRepository;
import Services.HoaDonService;
import ViewModels.HoaDonBanHangViewModels;
import ViewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class HoaDonServiceImpl implements HoaDonService{
    private HoaDonRepository ql = new HoaDonRepository();
    @Override
    public boolean saveHoaDon(HoaDon hd) {
        return ql.saveHoaDon(hd);
    }

    @Override
    public List<HoaDonBanHangViewModels> getHoaDon() {
        return ql.getHoaDon();
    }

    @Override
    public boolean updateTinhTrang(HoaDonBanHangViewModels hd, String id) {
        return ql.updateTinhTrang(hd, id);
    }

    @Override
    public HoaDonBanHangViewModels getIdByMa(String ma) {
        return ql.getIdByMa(ma);
    }

    @Override
    public String add(HoaDon hd) {
           boolean add = ql.addHoaDon(hd);
        if(add){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(HoaDon hd, String id) {
          boolean update = ql.updateHoaDon(hd, id);
        if(update){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
          boolean delete = ql.deleteHoaDon(id);
        if(delete){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public List<HoaDonViewModel> getAll() {
        return ql.getAll();
    }

    @Override
    public HoaDon getKHNV(String ma) {
        return ql.getHKNV(ma);
    }
    
}
