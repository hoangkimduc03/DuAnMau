/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.CuaHang;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceCuaHang {
    List<CuaHang> getAll();
    CuaHang getIdByTen(String ten);
    String add(CuaHang ch);
    String update(CuaHang ch,String id);
    String delete(String id);
    List<CuaHang> search(List<CuaHang> list,String ma);
}
