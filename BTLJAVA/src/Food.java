import java.util.Scanner;

public class Food {
    Scanner sc=new Scanner(System.in);
    public void foodInFormation(){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Food:");
            System.out.println("2.Drinks");
            System.out.println("Enter choose order:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    food();
                    break;
                case 2:
                    drinks();
                    break;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");
            }
        }
        while (true);
    }
    public void food(){
        do{
            System.out.println("1.Noodles");
            System.out.println("2.Pizza");
            System.out.println("Enter food");
            System.out.print("Enter the food you want to order:");
            int choose=sc.nextInt();
            switch (choose){
                case 1: case 2:
                    System.out.println("order successfully");
                    break;
                default:
                    System.out.print("Enter another food:");
                    String str=sc.nextLine();
                    System.out.println("order successfully");
             }
        }while (true);

    }
    public void drinks(){
        do{
            System.out.println("1.Sting");
            System.out.println("2.Coffee");
            System.out.println("3.7up");
            System.out.print("Enter the drink you want to order:");
            int choose=sc.nextInt();
            switch (choose){
                case 1: case 2: case 3:
                    System.out.println("order successfully");
                    break;
                default:
                    System.out.print("Enter another drink:");
                    String str=sc.nextLine();
                    System.out.println("order successfully");
            }
        }while (true);
    }
}
