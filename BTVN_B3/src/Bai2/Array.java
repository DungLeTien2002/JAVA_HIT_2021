package Bai2;

import java.security.PublicKey;
import java.util.Scanner;

public class Array {
    Scanner sc= new Scanner(System.in);
    private int n;
    private int []a;
    public  void inputData() {
        do {
            System.out.println("Nhap so luong phan tu n:");
            n=sc.nextInt();
            if(n<0) System.out.println("Nhap lai n:");
        }while (n<=0);
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap a["+(i+1)+"]=");
            a[i]=sc.nextInt();
        }
    }
    public void Show(){
        for(int i=0;i<n;i++) System.out.println(a[i]+" ");
    }
    public int Sum()
    {
        int sum=0;
        for(int i=0;i<n;i++)sum=sum+a[i];
        return sum;
    }
    public void Filter(Boolean flag)
    {
        if(flag==true)
        {
            for(int i=0;i<n;i++)if(a[i]%2==0) System.out.println(a[i]+" ");
        }
        else
        {
            for(int i=0;i<n;i++)if(i%2!=0) System.out.println(a[i]+" ");
        }
    }
    public Array(int n,int []a)
    {
        this.a=a;
        this.n=n;
    }
    public Array()
    {

    }
    public int[] getA() {
        return a;
    }

    public int getN() {
        return n;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }
}
