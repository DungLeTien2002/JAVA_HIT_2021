package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Add book");
            System.out.println("2.Edit book by id");
            System.out.println("3.Delete book by id");
            System.out.println("4.Sort books by name(ascending)");
            System.out.println("5.Sort books by prince(descending");
            System.out.println("6.Show all books");
            System.out.println("7.Exit");
            int bien=sc.nextInt();
            switch (bien){
                case 1:
                    addBook();
                    break;
                case 2:
                    editBookById();
                    break;
                case 3:
                    deleteBookById();
                    break;
                case 4:
                    sortBooksByName();
                    break;
                case 5:
                    sortBooksByPrice();
                    break;
                case 6:
                    showAllBooks();
                    break;
                case 7:
                    System.out.println("Da thoat chuong trinh:");
                    return;
                default:
                    System.out.println("Nhap lai");

            }
        }while (true);
    }
}
