package Bai1;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String s = sc.nextLine();
        int dem = 0, tich = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                dem++;
                if (s.charAt(i) > '1') {

                    for (int j = 1; j < s.charAt(i) - 48; j++) {
                        if (s.charAt(i) % j == 0) tich = tich * j;

                    }
                }

            }
        }
        System.out.println("Chuoi da nhap co " + dem + " ky tu so");
        System.out.println("Tich: " + tich);
    }
}
