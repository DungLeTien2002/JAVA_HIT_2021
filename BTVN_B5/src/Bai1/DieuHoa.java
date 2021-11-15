package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private float congSuat;
    private float giaBan;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap cong suat:");
        congSuat=sc.nextFloat();
        System.out.println("Nhap gia ban:");
        giaBan=sc.nextFloat();
        super.nhap();
    }
    public void xuat(){
        System.out.format("%-20f %-20f",congSuat,giaBan);
        super.xuat();
    }

    public float getGiaBan() {
        return giaBan;
    }
}
