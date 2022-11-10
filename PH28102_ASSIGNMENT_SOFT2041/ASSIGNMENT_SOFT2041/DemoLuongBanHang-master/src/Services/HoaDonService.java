/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import ViewModels.HoaDonResponse;
import java.util.List;


public interface HoaDonService {

    List<HoaDonResponse> getAll();

    HoaDon getOne(String id);

    String addHoaDon(HoaDon hoaDon);

    String updateHoaDon(String id, HoaDon hoaDon);

}
