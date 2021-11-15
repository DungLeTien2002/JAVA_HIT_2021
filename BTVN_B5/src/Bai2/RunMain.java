package Bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        System.out.println("Enter car: ");
        Car car=new Car();
        car.inputCar();
        System.out.println("Output car:");

        car.outputCar();
    }
}
