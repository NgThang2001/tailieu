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
public class Sach extends TaiLieu{
    String tenTG;
    int soTrang;
    Scanner nhap = new Scanner(System.in);

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập tên tác giả: ");
        tenTG = nhap.nextLine();
        boolean kt;
        do{
            kt=true;
            try {
                System.out.print("Nhập số trang: ");
                soTrang = Integer.parseInt(nhap.nextLine());
                if(soTrang<=0){
                    System.out.println("Lỗi! Vui lòng nhập số > 0");
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
        System.out.print("\t Tên tác giả: "+ tenTG + "\t Số trang: " + soTrang);
    }
}
