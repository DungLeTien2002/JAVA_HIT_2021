package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter arr1:");
        arr1.inputData();
        System.out.println("Please Enter arr2:");
        arr2.inputData();
        if((float)(arr1.Sum()/ arr1.getN())>(float)(arr2.Sum()/ arr2.getN()))arr1.Show();
        else

        {
            if((float)(arr1.Sum()/ arr1.getN())<(float)(arr2.Sum()/ arr2.getN()))arr2.Show();
            else System.out.println("Bye");
        }

    }
}
