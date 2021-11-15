package Bai3;

import java.util.Scanner;

public class Student extends People{
    protected String idStudent;
    protected String majors;
    protected int course;
    public void Student(){
    }
    public void Student(String  idStudent,String majors,int course){
        this.idStudent=idStudent;
        this.majors=majors;
        this.course=course;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public void inputStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter idStudent:");
        setIdStudent(sc.nextLine());
        System.out.println("Enter majors:");
        setMajors(sc.nextLine());
        System.out.println("Enter Course:");
        setCourse(sc.nextInt());
    }
    public void outputStudent(){
        System.out.format("%-20s %-20s %-10d",idStudent,majors,course);
    }
}
