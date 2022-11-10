/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.HoaDonChiTietResponse;
import java.util.List;

public interface HoaDonChiTietService {

    List<HoaDonChiTietResponse> getAllByHoaDonID();

    String addListOrder(String hoaDonID, List<HoaDonChiTietResponse> lists);
    
}
