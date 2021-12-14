/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailieu;

import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class TaiLieu {

    /**
     * @param args the command line arguments
     */
   
    
    String maTL, tenNXB;
    Scanner nhap = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhập mã tài liệu: ");
        maTL = nhap.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        tenNXB = nhap.nextLine();
    }
    
    public void xuat() {
        System.out.print("Mã tài liệu: "+maTL+"\t Tên NXB: "+tenNXB);
    }
   
}
