/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface HDCTService {
    boolean saveHDCT(HoaDonChiTiet hdct);
    List<HoaDonChiTiet>getAll();
    String delete(String id);
    
}
