package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person s1= new Person("Dũng",20,"Nam","Xemphim");
        System.out.println(s1);
        Person s2=new Person();
        s2.setName("Dũng đẹp trai");
        s2.setAge(20);
        s2.setGender("Nam");
        s2.setHobby("Đọc sách");
        System.out.println(s2);
    }
}
