/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import ViewModels.SanPhamResponse;
import java.util.List;
import java.util.Map;


public interface SanPhamService {

    List<SanPhamResponse> getAll();

    SanPham getOne(String id);

    void update(Map<SanPhamResponse, Integer> sanPhamResponse);

}
