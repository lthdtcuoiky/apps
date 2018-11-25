/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanlysp.managerquery;


import com.quanlysp.connectdata.clsConnectDB;
import com.quanlysp.view.ViewDangNhap;
import com.quanlysp.view.ViewTrangChu;

/**
 *
 * @author huy
 */
public class Manager {
  public static ViewTrangChu frmTC=new ViewTrangChu();
     public static clsConnectDB connection = new  clsConnectDB ();

    public static void main(String[] args) {
        ViewDangNhap frmDN= new   ViewDangNhap();

        frmDN.show();
    }
   
    
}
