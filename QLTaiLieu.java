/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailieu;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author FPTSHOP
 */
public class QLTaiLieu extends TaiLieu{
    ArrayList ds = new ArrayList();
    Scanner nhap = new Scanner(System.in);

     public static void main(String[] args) {
         QLTaiLieu ql = new QLTaiLieu();
         ql.nhapDS();
         ql.xuatDS();
     }
    
    public void nhapDS() {
        String key;
        int select=0;
        boolean kt;
        do{
             do{
                kt=true;
                try {
                    System.out.println("--------MENU---------");
                    System.out.println("1. Nhập thông tin sách: ");
                    System.out.println("2. Nhập thông tin tạp chí: ");
                    System.out.println("3. Nhập thông tin báo: ");
                    System.out.print("Lựa chọn: ");
                    select = Integer.parseInt(nhap.nextLine());
                    if(select<1 || select >3){
                        kt = false;
                        System.out.println("Không hợp lệ! Vui lòng nhập lựa chọn 1 - 3");
                    }
                } catch (Exception e) {
                    kt=false;
                    System.out.println("Lỗi "+e+"\nNhập lại" );
                }
            }while(kt!=true);     
            switch(select) {
                case 1: {
                    Sach sach = new Sach();
                    sach.nhap();
                    ds.add(sach);
                    break;
                }
                case 2: {
                    TapChi tapChi = new TapChi();
                    tapChi.nhap();
                    ds.add(tapChi);
                    break;
                }
                case 3: {
                    Bao bao = new Bao();
                    bao.nhap();
                    ds.add(bao);
                    break;
                }
                
            }
            System.out.println("Để tiếp tục nhập thông tin hãy nhập bất kì. \nĐể dừng hãy nhập S: ");
            System.out.print("Lựa chọn: ");
            key = nhap.nextLine();
            
        }while(key.equalsIgnoreCase("s")==false);
    }
    
    public void xuatDS() {
        System.out.println("==========DANH SÁCH TÀI LIỆU=========");
        for(int i=0;i<ds.size();i++)
        {
            
            
        }
    }
}
