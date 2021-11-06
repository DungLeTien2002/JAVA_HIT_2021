package Bai3;

import java.util.Scanner;

public class Hang {
    private int maHang;
    private String tenHang;
    private double donGia;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma hang: ");
        maHang=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang=sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextDouble();
    }
    public void xuat(){
        System.out.format("%-10d %-15s %-10.2f\n",maHang,tenHang,donGia);
    }
}
