/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.NhanVien;
import Repositories.LoginRepository;
import Services.ServiceLogin;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public class ServiceLoginImpl implements ServiceLogin{
    private LoginRepository ql = new LoginRepository();

    @Override
    public boolean check(String user, String pass) {
        List<NhanVien> list = ql.getLogin();
        
        for (NhanVien x : list) {
            if(x.getTen().equalsIgnoreCase(user) && x.getMatKhau().equalsIgnoreCase(pass)){
                return true;
            }
        }
        return false;
    }
   
    
}
