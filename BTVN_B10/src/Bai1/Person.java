package Bai1;

import java.util.Scanner;

public class Person  {
    protected int id;
    protected String name;
    protected String address;
    Scanner sc=new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sc=" + sc +
                '}';
    }

    public void input(){
        System.out.println("Enter id:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter address:");
        address=sc.nextLine();
    }
    public void output(){
        System.out.format("%-20d %-20s %-20s\n",id,name,address);
    }
}
