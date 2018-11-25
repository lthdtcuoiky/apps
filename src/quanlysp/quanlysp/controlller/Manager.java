/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlller;

import util.config.ConnectDB;
import view.admin.ViewDangNhap;
import view.admin.ViewTrangChu;

/**
 *
 * @author huy
 */
public class Manager {
  public static ViewTrangChu homePage =new ViewTrangChu();
     public static ConnectDB connection = new  ConnectDB ();

    public static void main(String[] args) {
        ViewDangNhap frmDN= new   ViewDangNhap();

        frmDN.show();
    }
   
    
}
