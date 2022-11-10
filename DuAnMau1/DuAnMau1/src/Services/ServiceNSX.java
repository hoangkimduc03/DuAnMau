/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NSX;
import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ServiceNSX {

    List<NSX> getAllNSX();

    String add(NSX nsx);

    String delete(String id);

    String update(NSX nsx, String id);

    NSX getIdByTen(String ten);
}
