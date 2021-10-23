package bai1;

import java.util.Scanner;


public class Runmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap a:");
        a=sc.nextInt();
        System.out.println("Nhap b:");
        b=sc.nextInt();
        System.out.println("Nhap c:");
        c=sc.nextInt();
        System.out.println( "So lon nhat trong 3 so a,b,c la: "+Math.max(a,Math.max(b,c)));
    }
}
