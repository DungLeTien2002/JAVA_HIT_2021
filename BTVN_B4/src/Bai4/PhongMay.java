package Bai4;

import java.util.Scanner;

public class PhongMay {
    private int maPhong;
    private String tenPhong;
    private double dienTich;
    QuanLy x;
    May []y;
    int n;
Scanner sc=new Scanner(System.in);
public void nhap(){
    System.out.println("Nhap ma phong: ");
    maPhong=sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap ten phong: ");
    tenPhong=sc.nextLine();
    System.out.println("Nhap dien tich: ");
    dienTich=sc.nextDouble();
    x=new QuanLy();
    x.nhap();
    System.out.println("Nhap so luong may n:");
    n=sc.nextInt();
    y=new May[n];
    for(int i=0;i<n;i++){
        System.out.println("Nhap thong tin may thu "+(i+1)+" : ");
        y[i]=new May();
        y[i].nhap();
    }

}
public void xuat(){
    System.out.println("Ma Phong: "+maPhong);
    System.out.println("Ten Phong: "+tenPhong);
    System.out.println("Dien tich: "+dienTich);
    x.xuat();
    System.out.format("%-10s %-15s %-15s\n","Ma May","Kieu May","Tinh Trang");
    for(int i=0;i<n;i++)y[i].xuat();
}
}
