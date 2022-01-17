import java.util.Scanner;

public class RunMain {
    public static void login(){
        Account account=new Account();
        account.accountLogin();

    }
    public static void create(){
        Account account=new Account();
        account.createAccount();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Log In");
        System.out.println("2.Create a new account");
        System.out.println("3.Exit ");
        do{
            System.out.print("Please Select Command:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    login();
                    return;
                case 2:
                    create();
                    break;
                case 3:
                    System.out.println("Successfully Exited");
                    return;
                default:
                    System.out.println("Enter wrong,Please Re-Enter");
            }

        }while (true);
    }
}
