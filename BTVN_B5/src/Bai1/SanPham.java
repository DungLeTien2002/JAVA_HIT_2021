package Bai1;

import java.util.Scanner;

public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected String tenNSX;
    protected String ngaySX;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma san pham:");
        maSP=sc.nextLine();
        System.out.println("Nhap ten SP:");
        tenSP=sc.nextLine();
        System.out.println("Nhap ten NSX:");
        tenNSX=sc.nextLine();
        System.out.println("Nhap ngay sx:");
        ngaySX=sc.nextLine();

    }
    public void xuat(){
        System.out.format("%-20s %-20s %-20s %-20s",maSP,tenSP,tenNSX,ngaySX);
    }
}
