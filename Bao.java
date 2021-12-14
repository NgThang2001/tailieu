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
public class Bao extends TaiLieu{
    int ngayPhatHanh;
    Scanner nhap = new Scanner(System.in);
    
    @Override
    public void nhap() {
        super.nhap();
        boolean kt;
        do{
            kt=true;
            try {
                System.out.print("Nhập ngày phát hành: ");
                ngayPhatHanh = Integer.parseInt(nhap.nextLine());
                if(ngayPhatHanh<=0 || ngayPhatHanh>31){
                    System.out.println("Lỗi! Vui lòng nhập số > 0 và <= 31");
                    kt = false;
                }
            } catch (Exception e) {
                kt=false;
                System.out.println("Lỗi "+e+"\nNhập lại" );
            }
        }while(kt!=true);
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\t Số phát hành: " + ngayPhatHanh);
    }

}
