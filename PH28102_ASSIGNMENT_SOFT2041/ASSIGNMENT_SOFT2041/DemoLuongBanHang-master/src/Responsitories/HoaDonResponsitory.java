/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitories;

import DomainModels.HoaDon;
import ViewModels.HoaDonResponse;
import java.util.List;


public interface HoaDonResponsitory {

    List<HoaDonResponse> getAll();

    HoaDon getOne(String id);

    boolean addHoaDon(HoaDon hoaDon);

    boolean updateHoaDon(String id, HoaDon hoaDon);

}
