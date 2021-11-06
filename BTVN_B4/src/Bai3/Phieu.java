package Bai3;

import java.util.Scanner;

public class Phieu {
    private int maPhieu;
    int n;
    private Hang []a;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        maPhieu=sc.nextInt();
        do{
            System.out.println("Nhap so luong mat hang n: ");
            n=sc.nextInt();
            if(n<=0) System.out.println("Nhap lai n:");
        }while (n<=0);
        a=new Hang[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin mat hang thu "+(i+1)+" : ");
            a[i]=new Hang();
            a[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("Ma phieu: "+maPhieu);
        System.out.format("%-10s %-15s %-15s\n","MA HANG","TEN HANG","DON GIA");
        for(int i=0;i<n;i++)a[i].xuat();
    }
}
