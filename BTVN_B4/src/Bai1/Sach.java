package Bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sach {
    private int maSach;
    private String tenSach;
    private String NXB;
    private int soTrang;
    private double giaTien;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach=sc.nextLine();
        System.out.println("Nhap ten NXB: ");
        NXB=sc.nextLine();
        System.out.println("Nhap so trang sach: ");
        soTrang=sc.nextInt();
        System.out.println("Nhap gia tien: ");
        giaTien=sc.nextDouble();

    }
    public void xuat(){
        System.out.format("%-15d %-20s %-20s %-15d %-15.2f\n",maSach,tenSach,NXB,soTrang,giaTien);
    }
}
