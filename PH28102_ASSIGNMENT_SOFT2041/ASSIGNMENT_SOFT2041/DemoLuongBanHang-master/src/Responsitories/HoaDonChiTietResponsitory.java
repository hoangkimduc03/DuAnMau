/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitories;

import ViewModels.HoaDonChiTietResponse;
import java.util.List;


public interface HoaDonChiTietResponsitory {

    List<HoaDonChiTietResponse> getAllByHoaDonID();

    boolean addListOrder(String hoaDonID, List<HoaDonChiTietResponse> lists);

}
