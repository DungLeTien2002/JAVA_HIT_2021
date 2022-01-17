
import java.util.Scanner;

public class Member extends Account {
    Scanner sc=new Scanner(System.in);
    public void member(){
        System.out.println("1.Export Account Information:");
        System.out.println("2.Choose Service:");
        System.out.println("3.Evaluate:");
        System.out.println("4.Log Out:");
        do{
            System.out.print("Please Select Command:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                   InFor();
                    break;
                case 2:
                    service();
                    break;
                case 3:
                    evaluate();
                    break;
                case 4:
                   return;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");
            }

        }while (true);
    }

    public void service(){
        System.out.println("1.Room:");
        System.out.println("2.Food:");
        do{
            System.out.print("Please choose service:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    Room room=new Room();
                    room.chooseARoom();
                    break;
                case 2:
                    Food food=new Food();
                    break;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");

            }

        }while (true);
    }
    public void evaluate(){
        System.out.println("1.Good");
        System.out.println("2.Medium");
        System.out.println("3.Bad");
        do{
            System.out.print("Please select a review");
            int chosse=sc.nextInt();
            switch (chosse){
                case 1:
                    System.out.println("Thank you.See you again");
                    member();
                    break;
                case 2:
                    System.out.println("Thank you.See you again");
                    member();
                    break;
                case 3:
                    System.out.println("Thank you.See you again");
                    member();
                    break;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");

            }
        }while (true);
    }
}
