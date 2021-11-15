package Bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class RunMain {
    public static void main(String[] args) {
        Class c=new Class();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter class:");
        input(c);
        output(c);
        int dem=0;
        for(int i=0;i<c.getN();i++){
            if(c.getStudents().get(i).getCourse()==15){
                dem++;
            }
        }
        System.out.println("number of students in class 15: "+dem);
        swap(c);
        output(c);


    }
    public static void input(Class c){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter idClass:");
        c.setIdClass(sc.nextLine());
        System.out.println("Enter nameClass:");
        c.setNameClass(sc.nextLine());
        System.out.println("Enter openDay:");
        c.setOpenDay(sc.nextLine());
        System.out.println("Enter n:");
        c.setN(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter teacher: ");
        c.setTeacher(sc.nextLine());
        ArrayList<Student>students=new ArrayList<>();
        for(int i=0;i<c.getN();i++){
            System.out.println("Enter student "+(i+1)+" :");
            Student student=new Student();
            student.inputStudent();
            student.inputPeople();
            students.add(student);
        }
        c.setStudents(students);
    }
    public static void output(Class c){
        System.out.println(" idClass:"+c.getIdClass());
        System.out.println("NameClass:"+c.getNameClass());
        System.out.println("OpenDay:"+c.getOpenDay());
        System.out.println("Teacher:"+c.getTeacher());
        System.out.format("%-20s %-20s %-10s %-20s %-20s %-20s\n","idStudent","majors","course","name","date","home town");
        for(int i=0;i<c.getN();i++){
            c.getStudents().get(i).outputStudent();
            c.getStudents().get(i).outputPeople();
            System.out.println("\n");
        }
    }
    public static void swap(Class c) {
        for (int i = 0; i < c.getN() - 1; i++)
            for (int j = i; j < c.getN(); j++) {
                if (c.getStudents().get(i).getCourse() > c.getStudents().get(j).getCourse()) {
                    Collections.swap(c.getStudents(), i, j);
                }
            }
    }

}
