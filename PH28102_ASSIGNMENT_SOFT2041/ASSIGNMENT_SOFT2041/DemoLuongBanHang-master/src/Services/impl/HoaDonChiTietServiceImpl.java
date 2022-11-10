/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import Responsitories.HoaDonChiTietResponsitory;
import Responsitories.impl.HoaDonChiTietResponsitoryImpl;
import Services.HoaDonChiTietService;
import ViewModels.HoaDonChiTietResponse;
import java.util.List;


public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    private final HoaDonChiTietResponsitory hoaDonChiTietResponsitory
            = new HoaDonChiTietResponsitoryImpl();

    @Override
    public List<HoaDonChiTietResponse> getAllByHoaDonID() {
        return hoaDonChiTietResponsitory.getAllByHoaDonID();
    }

    @Override
    public String addListOrder(String hoaDonID, List<HoaDonChiTietResponse> lists) {
        boolean add = hoaDonChiTietResponsitory.addListOrder(hoaDonID, lists);
        if (add) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

}
