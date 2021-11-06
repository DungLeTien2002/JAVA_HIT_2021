package Bai4;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private  String tinhTrang;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma may: ");
        maMay=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap kieu may:");
        kieuMay=sc.nextLine();
        System.out.println("Nhap tinh trang may: ");
        tinhTrang=sc.nextLine();
    }
    public void xuat(){
        System.out.format("%-10d %-15s %-15s\n",maMay,kieuMay,tinhTrang);
    }

}
