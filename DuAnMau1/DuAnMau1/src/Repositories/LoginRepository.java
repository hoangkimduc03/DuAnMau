/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Utilities.DBConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Diệm DZ
 */
public class LoginRepository {
    
    public List<NhanVien> getLogin(){
        String sql = "select Ten,MatKhau from NhanVien";
        try (Connection con = DBConnection.getConnection();PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            List<NhanVien> list = new ArrayList<>();
            while (rs.next()) {                
                list.add(new NhanVien(rs.getString(1), rs.getString(2)));
            }return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(new LoginRepository().getLogin());
    }
}
