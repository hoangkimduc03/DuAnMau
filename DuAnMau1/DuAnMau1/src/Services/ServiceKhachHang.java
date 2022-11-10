/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import ViewModels.KhachHangViewModels;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceKhachHang {
    List<KhachHangViewModels> getAll();
    KhachHang getByMa(String ma);
    String add(KhachHang kh);
    String update(KhachHang kh, String id);
    String delete(String id);
    List<KhachHangViewModels> searchByMa(List<KhachHangViewModels> list,String ma);
    KhachHang getIdByTen(String ten);
}
