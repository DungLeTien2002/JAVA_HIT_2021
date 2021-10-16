import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m:");
        m= sc.nextInt();
        System.out.println("Nhap n:");
        n= sc.nextInt();
        for(int i = 1 ; i <= m ; i ++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                if(i == 1 || i == m || j == 1 || j == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("\n");
        }
    }
}