package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Person> people = new ArrayList<Person>();
        try {
            do {
                System.out.println("Enter number person n:");
                n = sc.nextInt();
                if (n <= 0) System.out.println("Errol\n");
            } while (n <= 0);
            for (int i = 0; i < n; i++) {
                System.out.println("Enter infor person " + (i + 1) + " :");
                Person p = new Person();
                p.input();
                people.add(p);
            }
        } catch (Exception e) {
            System.out.println("Errol\n");
        }
        System.out.println("Danh sach vua nhap:\n");
        System.out.format("%-20s %-20s %-20s\n", "id", "name", "address");
        for (Person p : people) {
            p.output();

        }
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }

        });
        System.out.println("sap xep tang dan theo id:\n");
        System.out.format("%-20s %-20s %-20s\n", "id", "name", "address");
        for (Person p : people) {
            p.output();
        }
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().compareTo(o2.getName())==0)return o1.getAddress().compareTo(o2.getAddress());
                    else return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("sap theo theo yeu cau de bai :v\n");
        System.out.format("%-20s %-20s %-20s\n", "id", "name", "address");
        for (Person p : people) {
            p.output();
        }
    }
}
