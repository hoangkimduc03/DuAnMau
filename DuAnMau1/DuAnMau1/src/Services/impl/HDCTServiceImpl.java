/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDonChiTiet;
import Repositories.HoaDonChiTietRepository;
import Services.HDCTService;
import Services.HoaDonService;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class HDCTServiceImpl implements HDCTService{
    private HoaDonChiTietRepository ql = new HoaDonChiTietRepository();
    
    @Override
    public boolean saveHDCT(HoaDonChiTiet hdct) {
        return ql.saveHDCT(hdct);
    }

    @Override
    public List<HoaDonChiTiet> getAll() {
        return ql.getAll();
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
    
}
