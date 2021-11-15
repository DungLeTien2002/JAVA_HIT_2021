package Bai3;

import java.util.Scanner;

public class People {
    protected String name;
    protected String date;
    protected String homeTown;
    Scanner sc=new Scanner(System.in);
    public void inputPeople(){
        System.out.println("Enter name :");
        name=sc.nextLine();
        System.out.println("Enter date:");
        date=sc.nextLine();
        System.out.println("Enter home Town: ");
        homeTown=sc.nextLine();

    }
    public void outputPeople(){
        System.out.format("%-20s %-20s%-20s",name,date,homeTown);
    }
}
