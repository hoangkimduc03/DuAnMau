/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitories;

import DomainModels.SanPham;
import ViewModels.SanPhamResponse;
import java.util.List;


public interface SanPhamRespository {

    List<SanPhamResponse> getAll();

    SanPham getOne(String id);

    boolean update(String id,int soLuong);
    
}
