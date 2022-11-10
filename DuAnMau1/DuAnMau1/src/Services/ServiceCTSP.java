/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ChiTietSanPham;
import ViewModels.ChiTietSanPhamModels;
import ViewModels.SanPhamBanHangViewModel;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceCTSP {
    List<SanPhamBanHangViewModel> getAll();
    List<ChiTietSanPhamModels> getAllSanPham();
    String add(ChiTietSanPham ct);
    String update(ChiTietSanPham ct, String id);
    String delete(String id);
    ChiTietSanPham getID(String id);
    ChiTietSanPham getIDByIDSP(String id);
    boolean updateSoLuong(ChiTietSanPham ctsp,String id);
}
