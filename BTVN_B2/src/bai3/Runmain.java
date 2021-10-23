package bai3;

import java.util.Scanner;

public class Runmain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String s= sc.nextLine();
        int n=s.length();
        int dem=0,tong=0;
        for(int i=0;i<n;i++)
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                dem++;

                tong=tong+Character.getNumericValue(s.charAt(i));

            }
        if(dem!=0){
            System.out.println("true");
            System.out.println("Trung binh cong cac chu so co trong chuoi: "+(float)tong/dem);
        }
        else System.out.println("false");

    }
}
