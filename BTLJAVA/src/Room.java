import java.util.Scanner;

public class Room {
    Scanner sc=new Scanner(System.in);
    public void chooseARoom(){
        System.out.println("1.Common Room:");
        System.out.println("2.Private Room:");
        System.out.println("3.Game Room:");
        do{
            System.out.print("Please select room type:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    Computer computer1=new Computer();
                    computer1.chooseAComputer();
                    break;
                case 2:
                    Computer computer2=new Computer();
                    computer2.chooseAComputer();
                    break;
                case 3:
                    Computer computer3=new Computer();
                    computer3.chooseAComputer();
                    break;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");
            }
        }while (true);
    }



}
