/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import DomainModels.KhachHang;
import ViewModels.HoaDonBanHangViewModels;
import ViewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface HoaDonService {
    boolean saveHoaDon(HoaDon hd);
    List<HoaDonBanHangViewModels> getHoaDon();
    boolean updateTinhTrang(HoaDonBanHangViewModels hd,String id);
    HoaDonBanHangViewModels getIdByMa(String ma);
    List<HoaDonViewModel> getAll();
    String add(HoaDon hd);
    String update(HoaDon hd, String id);
    String delete(String id);
    HoaDon getKHNV(String ma);
}
