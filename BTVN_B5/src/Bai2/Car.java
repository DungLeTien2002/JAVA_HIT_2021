package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private String idCar;
    private String nameCar;
    private DateTime a;
    ArrayList<Product> x=new ArrayList<>();
    private int n;
    Scanner sc=new Scanner(System.in);
    public void inputCar(){
        System.out.println("Enter idCar:");
        idCar=sc.nextLine();
        System.out.println("Enter nameCar:");
        nameCar =sc.nextLine();
        a=new DateTime();
        a.inputDate();
        System.out.println("Enter n:");
        n=sc.nextInt();
        //ArrayList<Product>x=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            System.out.println("Enter car "+(i+1)+" :");
            Product b=new Product();
            b.inputProduct();
            x.add(b);
        }
    }
    public void outputCar(){
        System.out.format("%-20s %-20s\n","idCar","nameCar");
        System.out.format("%-20s %-20s\n",idCar,nameCar);
        System.out.format("%-10s %-10s %-10s\n","day","month","year");
        a.outputDate();
        System.out.format("%-20s %-20s %-15s %-15s\n","idProduct","nameProduct","quantity","price");
        for(int i=0;i<n;i++){
            x.get(i).outputProduct();
        }
    }
}
