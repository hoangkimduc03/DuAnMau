/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import ViewModels.NHanVienViewModels;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceNhanvien {
    List<NHanVienViewModels> getAll();
    NhanVien getById(String id);
    String add(NhanVien nv);
    String update(NhanVien nv,String id);
    String delete(String id);
    List<NHanVienViewModels> getByMa(List<NHanVienViewModels> list,String ma);
    NhanVien getCHCV(String id);
     NhanVien getIdByTen(String ten);
}
