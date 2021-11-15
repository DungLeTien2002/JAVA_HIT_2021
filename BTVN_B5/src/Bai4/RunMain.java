package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> x = new Sum<Integer>(8,9);
        System.out.println("Tong hai so: " + (x.getSoA()+x.getSoB()));
        Sum<Long> y = new Sum<Long>(20l, 6l);
        System.out.println("Tong hai so: " + (y.getSoA()+y.getSoB()));
        Sum<Float> z = new Sum<Float>(0.5f,3.9f);
        System.out.println("Tong hai so: " + (z.getSoA()+z.getSoB()));
        Sum<Double> p = new Sum<Double>(12.4,1.5);
        System.out.println("Tong hai so: " + (p.getSoA()+p.getSoB()));
    }
}
