/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.MauSac;
import DomainModels.NSX;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceMauSac {
     List<MauSac> getAllMauSac();
    String add(MauSac ms);
    String delete(String id);
    String update(MauSac ms,String id); 
    MauSac getIdByTen(String ten);
}
