import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.String;

public class Account extends Person{
    Scanner sc=new Scanner(System.in);
public void accountLogin(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account:");
        String account=sc.nextLine();
        System.out.print("Enter password:");
        String passWord=sc.nextLine();
    String s=Character.toString(account.charAt(0));
    if(s.compareTo("b")==0) {
        Boss boss=new Boss();
    }else {
        if(s.compareTo("s")==0){
            Staff staff=new Staff();
            staff.menuStaff();

            //outputInFormation();

        }else{
            if(s.compareTo("M")==0){
                Manage manage=new Manage();
            }else{
                Member member=new Member();
                member.member();
                InFor();

            }
        }

    }

    }
    public void createAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter new Account:");
        String account=sc.nextLine();
        System.out.print("Enter new password:");
        String passWord=sc.nextLine();
        accountLogin();
    }
    public void InFor(){
        if(name!= null && !name.isEmpty()) outputInFormation();
        else {
            createInForAccount();
            outputInFormation();
        }

    }
    public void createInForAccount(){
        System.out.print("Enter new name:");
        name=sc.nextLine();
        System.out.print("Enter new age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new identityCard:");
        identityCard=sc.nextLine();
        System.out.print("Enter address:");
        address=sc.nextLine();
        System.out.print("Enter sex:");
        sex=sc.nextLine();
    }
    public void outputInFormation(){
        System.out.println("Name:"+name+"     Age:"+age+"     IdentityCard:"+identityCard+"     Address:"+address+"     Sex:"+sex);
    }
    public void editCustomerInFormation(){
        System.out.println("1.Edit name:");
        System.out.println("2.Edit age:");
        System.out.println("3.Edit identityCard:");
        System.out.println("4.Edit address:");
        System.out.println("5.Edit sex:");
        do{
            System.out.println("Please Choose Oder:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Please Enter New Name:");
                    name=sc.nextLine();
                    break;
                case 2:
                    System.out.println("Please Enter New Age:");
                    age=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Please Enter New identityCard:");
                    identityCard=sc.nextLine();
                    break;
                case 4:
                    System.out.println("Please Enter New address:");
                    address=sc.nextLine();
                    break;
                case 5:
                    System.out.println("Please Enter New sex:");
                    sex=sc.nextLine();
                    break;

            }
        }while (true);
    }
    public void messageWithCustomers(){
        System.out.print("Enter The Name Of The customer you want to message:");
        String str=sc.nextLine();
        if(str.compareTo(name)==0) System.out.print("Enter message:");
        String s=sc.nextLine();
        System.out.println("submitted successfully");
    }
    public void viewCustomerInformation(){

    }
    public void clientComputerControl(){

    }
}
