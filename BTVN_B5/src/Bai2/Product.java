package Bai2;

import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Product {
    protected String idProduct;
    protected String nameProduct;
    protected int quantity;
    protected float price;
    Scanner sc=new Scanner(System.in);
    public void inputProduct(){
        System.out.println("Enter idProduct:");
        idProduct=sc.nextLine();
        System.out.println("Enter nameProduct:");
        nameProduct=sc.nextLine();
        System.out.println("Enter quantity:");
        quantity=sc.nextInt();
        System.out.println("Enter price:");
        price=sc.nextFloat();

    }
    public void outputProduct(){
        System.out.format("%-20s %-20s %-15d %-15f\n",idProduct,nameProduct,quantity,price);
    }
}
