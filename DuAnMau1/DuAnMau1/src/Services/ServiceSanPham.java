/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceSanPham {
    List<SanPham> getAll();
    String add(SanPham sp);
    String delete(String id);
    String update(SanPham sp,String id); 
    SanPham getId(String ma);
    SanPham getIdByTen(String ten);
}
