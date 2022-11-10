/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import Repositories.CuaHangRepository;
import Services.ServiceCuaHang;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceCuaHangImpl implements ServiceCuaHang{
    private CuaHangRepository ql = new CuaHangRepository();
    @Override
    public List<CuaHang> getAll() {
        return ql.getAll();
    }

    @Override
    public CuaHang getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }
     @Override
    public String add(CuaHang ch) {
        if(ch.getMa().isEmpty()){
            return "Không để trống mã";
        }
        if(ch.getTen().isEmpty()){
            return "Không để trống tên";
        }
        if(ch.getDiaChi().isEmpty()){
            return "Không để trống địa chỉ";
        }
        if(ch.getThanhPho().isEmpty()){
            return "Không để trống thành phố";
        }
        if(ch.getQuocGia().isEmpty()){
            return "Không để trống quốc gia";
        }
        if(ch.getMa().matches("CH+[0-9]{3}+") == false){
            return "Mã không đúng định dạng";
        }
        boolean add = ql.add(ch);
        if(add){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(CuaHang ch, String id) {
        boolean update = ql.update(ch, id);
        if(update){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
         boolean delete = ql.delete( id);
        if(delete){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public List<CuaHang> search(List<CuaHang> list, String ma) {
        return ql.search(ma);
    }

    
}
