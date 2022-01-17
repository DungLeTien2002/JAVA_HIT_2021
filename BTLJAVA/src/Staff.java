import java.util.Scanner;

public class Staff extends Account{
    public void menuStaff(){
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Show My InFormation");
        System.out.println("2.Edit Customer Information");
        System.out.println("3.Message With Customers");
        System.out.println("4.View customer information");
        System.out.println("5.Client Computer Control");
            System.out.print("Please Choose Order:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    InFor();
                    break;
                case 2:
                    editCustomerInFormation();
                    break;
                case 3:
                    messageWithCustomers();
                    break;
                case 4:
                    viewCustomerInformation();
                    break;
                case 5:
                    clientComputerControl();
                    break;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");

            }
        }while (true);
    }
}
