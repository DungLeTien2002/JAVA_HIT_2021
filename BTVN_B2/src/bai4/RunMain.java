package bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String s=sc.nextLine();
        int n=s.length();
        s=s.trim();
        while (s.contains("  ")==true)
        s=s.replace("  "," ");
        s=s.replaceAll("[0-9]","");
        System.out.println("chuoi da chuan hoa:"+s);

    }
}
