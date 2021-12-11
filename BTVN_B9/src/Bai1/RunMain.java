package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1=new Customer("Trung","HN",3300);
        Person person2=new Employee("Linh","BN",10400);
        person1.display();
        person2.display();
    }
}
