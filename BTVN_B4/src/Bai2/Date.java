package Bai2;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ngay: ");
        day=sc.nextInt();
        System.out.println("Nhap thang: ");
        month=sc.nextInt();
        System.out.println("Nhap nam: ");
        year=sc.nextInt();
    }
    public void xuat(){
        System.out.println("Day: "+day+" Month: "+month+" Year: "+year);
    }
}
