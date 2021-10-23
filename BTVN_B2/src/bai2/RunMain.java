package bai2;


import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bien;
        int n;
        System.out.print("Nhap so luong phan tu n = ");
        n = sc.nextInt();
        int[]a;
        a = new int[n+1];
        do{
            System.out.println("1.Nhap mang");
            System.out.println("2.Xuat mang");
            System.out.println("3.them 1 phan tu vao vi tri bat ki");
            System.out.println("4.xoa mot phan tu ơ vi tri bat ki");
            System.out.println("5.Hien thi mang dao nguoc");
            System.out.println("6.Hien thi cac phan tu a[1] va cac so chia het cho a[1]");
            System.out.println("7.xuat ra tong cac so nguyen to trong mang");
            System.out.println("8.Thoat chuong trinh");
            System.out.print("Vui long chon cau lenh:");
            bien = sc.nextInt();
            switch(bien){
                case 1:
                    nhapMang(a, n);
                    break;
                case 2:
                    System.out.println("Xuat mang:");
                    xuatMang(a,n);
                    break;
                case 3:
                    them(a,n);
                    n++;
                    break;
                case 4:
                    xoa(a,n);
                    n--;
                    break;
                case 5:
                    dao(a,n);
                    break;
                case 6:
                    gionga1(a,n);
                    break;
                case 7:
                    System.out.println("Tong cac so nguyen to trong mang la: " + sumNT(a, n));
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh thanh cong");
                    return ;
                default:
                    System.out.println("Vui long nhap lai");
            }
        }while(true);
    }
    public static void nhapMang(int []a, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap mang");
        for(int i=0;i<n;i++){
            System.out.println("Nhap a[ " + (i+1) +"]=");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int []a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static void them(int []a, int n ) {
        Scanner sc = new Scanner(System.in);
        int k,x;
        do{
            System.out.print("Nhap vi tri can chen k: ");
            k = sc.nextInt();
        }while(k<=0 && k > n);
        System.out.print("Nhap so can chen x: ");
        x = sc.nextInt();
        for(int i=n;i>=k;i--){
            a[i] = a[i-1];
        }
        n++;
        a[k-1] = x;
        System.out.println("Mang sau khi chen ");
        xuatMang(a, n);
    }
    public static void xoa(int []a, int n) {
        Scanner sc = new Scanner(System.in);
        int k;
        do{
            System.out.print("Nhap vi tri can xoa k: ");
            k = sc.nextInt();
        }while(k<=0 && k > n);
        for(int i=k-1;i<n;i++){
            a[i]=a[i+1];
        }
        n--;
        System.out.println("Mang sau khi xoa:");
        xuatMang(a, n);
    }
    public static void dao(int [] a, int n) {
        System.out.println("Mang sau khi dao nguoc: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
    }
    public static void gionga1(int []a,int n) {
        System.out.println("a[1]= " + a[1]);
        System.out.println("Cac so trong mang chi het cho a[1] la : ");
        for(int i=0;i<n;i++){
            if(a[i]%a[1]==0)
                System.out.println(a[i] + " ");
        }
    }
    public static boolean kt(int n) {
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static int sumNT(int [] a, int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            if(kt(a[i]) == true)
                sum+=a[i];
        }
        return sum;
    }
}

