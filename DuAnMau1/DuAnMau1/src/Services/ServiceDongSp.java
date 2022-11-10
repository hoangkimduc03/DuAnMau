/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.DongSp;
import DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceDongSp {
        List<DongSp> getAllDongSp();
    String add(DongSp dsp);
    String delete(String id);
    String update(DongSp dsp,String id); 
    DongSp getIdByTen(String ten);
}
