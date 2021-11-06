package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        NhanSu a=new NhanSu();
        System.out.println("Nhap thong tin nhan su: ");
        a.nhap();
        System.out.println("Thong tin nhan su vua nhap la: ");
        a.xuat();
    }
}
