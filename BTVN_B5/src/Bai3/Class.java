package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private String idClass;
    private String nameClass;
    private String openDay;
    ArrayList<Student> students=new ArrayList<>();
    private int n;
    private String teacher;
    Scanner sc=new Scanner(System.in);
    public void Class(String idClass,String nameClass,String openDay,int n,String teacher){
        this.idClass=idClass;
        this.nameClass=nameClass;
        this.openDay=openDay;
        this.n=n;
        this.teacher=teacher;

    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
