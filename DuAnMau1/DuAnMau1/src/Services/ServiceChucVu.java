/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceChucVu {
    List<ChucVu> getAll();
    ChucVu getIdByTen(String ten);
      String add(ChucVu cv);
      String update(ChucVu cv,String id);
      String delete(String id);
      List<ChucVu> search(List<ChucVu> list,String ma);
}
