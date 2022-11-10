/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ChucVu;
import Repositories.ChucVuRepository;
import Services.ServiceChucVu;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceChucVuImpl implements ServiceChucVu{
    private ChucVuRepository ql = new ChucVuRepository();
    @Override
    public List<ChucVu> getAll() {
        return ql.getAll();
    }

    @Override
    public ChucVu getIdByTen(String ten) {
        return ql.getIdByTen(ten);
    }

    @Override
    public String add(ChucVu cv) {
        if(cv.getMa().isEmpty()){
            return "Không để trống mã";
        }
        if(cv.getTen().isEmpty()){
            return "Không để trống tên";
        }
        boolean add = ql.add(cv);
        if(add){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(ChucVu cv, String id) {
        boolean update = ql.update(cv, id);
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
    public List<ChucVu> search(List<ChucVu> list, String ma) {
        return ql.search(ma);
    }
    
}
