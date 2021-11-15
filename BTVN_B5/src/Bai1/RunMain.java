package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so luong dieu hoa n:");
            n=sc.nextInt();
            if(n<=0) System.out.println("Nhap lai n:\n");
        }while (n<=0);
       ArrayList<DieuHoa> dieuHoa=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            DieuHoa a=new DieuHoa();
            System.out.println("Nhap thong tin dieu hoa thu "+(i+1)+" :");
            a.nhap();
            dieuHoa.add(a);
        }
        int dem=0;
        System.out.println("Danh sach cac dieu hoa co hang san xuat Electrolux");
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s\n","cong suat","gia ban","ma sp","ten sp","hang sx","ngay sx");
        for(int i=0;i<n;i++){
            String s1="electrolux";
            if(dieuHoa.get(i).tenNSX.equalsIgnoreCase(s1)==true){
                dieuHoa.get(i).xuat();
                dem++;
            }
        }
    if(dem==0) System.out.println("Khong ton tai");
    float min=dieuHoa.get(0).getGiaBan();
    for(int i=1;i<n;i++){
        if(dieuHoa.get(i).getGiaBan()<min)min=dieuHoa.get(i).getGiaBan();
    }
        System.out.println("\n");
        System.out.println("danh sach cac san pham co gia nho nhat la:");
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s\n","cong suat","gia ban","ma sp","ten sp","hang sx","ngay sx");
    for(int i=0;i<n;i++){
        if(dieuHoa.get(i).getGiaBan()==min)dieuHoa.get(i).xuat();
    }
    }
}
