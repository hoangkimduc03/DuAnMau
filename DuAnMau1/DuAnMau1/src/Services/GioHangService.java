/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import ViewModels.GioHangViewModels;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface GioHangService {
    List<GioHangViewModels> getAll();
    String add(GioHang gh);
    String update(GioHang gh,String id);
    String delete(String id);
    GioHang getId(String ma);
    List<GioHangViewModels> search(List<GioHangViewModels> list,String ma);
}
