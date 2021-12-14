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
public class TapChi extends TaiLieu{
    int soPhatHanh, thangPhatHanh;
    Scanner nhap = new Scanner(System.in);

    @Override
    public void nhap(){
        super.nhap();
        boolean kt;
        do{
            kt=true;
            try {
                System.out.print("Nhập số phát hành: ");
                soPhatHanh = Integer.parseInt(nhap.nextLine());
                if(soPhatHanh<=0){
                    System.out.println("Lỗi! Vui lòng nhập số > 0");
                    kt = false;
                }
            } catch (Exception e) {
                kt=false;
                System.out.println("Lỗi "+e+"\nNhập lại" );
            }
        }while(kt!=true);
       
        do{
            kt=true;
            try {
                System.out.print("Nhập tháng phát hành: ");
                thangPhatHanh = Integer.parseInt(nhap.nextLine());
                if(thangPhatHanh<=0 || thangPhatHanh>12){
                    System.out.println("Lỗi! Vui lòng nhập số > 0 và <= 12");
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
        System.out.print("\t Số phát hành: " + soPhatHanh + "\t Tháng phát hành: " + thangPhatHanh);
    }
}
