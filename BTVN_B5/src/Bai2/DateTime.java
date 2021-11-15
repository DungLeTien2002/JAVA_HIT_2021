package Bai2;

import java.util.Scanner;

public class DateTime {
    protected int day;
    protected int month;
    protected int year;
    Scanner sc=new Scanner(System.in);
    public void inputDate(){
        System.out.println("Enter day:");
        day=sc.nextInt();
        System.out.println("Enter month:");
        month=sc.nextInt();
        System.out.println("Enter year:");
        year=sc.nextInt();

    }
    public void outputDate(){
        System.out.format("%-10d  %-10d  %-10d\n",day,month,year);
    }
}
