package Bai4;

import java.util.Scanner;

public class QuanLy {
    private int maQL;
    private String hoTen;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma quan ly: ");
        maQL=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoTen=sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan ly: "+maQL+"   Ho va ten: "+hoTen);
    }
}
