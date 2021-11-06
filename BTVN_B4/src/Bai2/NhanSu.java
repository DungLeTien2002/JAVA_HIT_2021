package Bai2;

import java.util.Scanner;

public class NhanSu {
    private int maNhanSu;
    private String hoVaTen;
    private Date NS;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        NS=new Date();
        System.out.println("Nhap ma nhan su:");
        maNhanSu=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoVaTen=sc.nextLine();
        NS.nhap();
    }
    public void xuat(){
        System.out.println("Ma nhan su: "+maNhanSu);
        System.out.println("Ho va ten: "+hoVaTen);
        NS.xuat();
    }
}
