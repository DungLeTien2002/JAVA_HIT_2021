import java.util.Scanner;

public class Computer {
    Scanner sc=new Scanner(System.in);
    public void chooseAComputer(){
        System.out.println("1.Play Always:");
        System.out.println("2.Place The Computer:");
        do{
            System.out.print("Please select the computer:");
            int choose=sc.nextInt();
            switch ( choose){
                case 1:
                    System.out.println("Select the machine successfully. Please follow the staff.");
                    return;
                case 2:
                    placeTheComputer();
                    return;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");

            }

        }while (true);
    }
    public void placeTheComputer(){
        System.out.println("Please enter start and end time");
        String str=sc.nextLine();
        System.out.println("Set up successfully.Thank you");
    }
}
