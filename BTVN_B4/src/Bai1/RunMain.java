package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so luong sach: ");
            n=sc.nextInt();
            if(n<=0) System.out.println("Nhap lai n: \n");
        }
        while (n<=0);
        Sach []a=new Sach[n];
        for(int i=0;i<n;i++){
            a[i]=new Sach();
            System.out.println("Nhap thong tin sach thu "+(i+1)+" : ");
            a[i].nhap();
        }
        System.out.format("%-15s %-20s %-20s %-15s %-15s\n","maSach","tenSach","NXB","soTrang","giaTien");
       for(int i=0;i<n;i++)a[i].xuat();
    }
}
