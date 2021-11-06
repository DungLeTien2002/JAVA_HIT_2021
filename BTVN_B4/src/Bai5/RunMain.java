package Bai5;

import jdk.swing.interop.SwingInterOpUtils;

public class RunMain {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if (n == (int) n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        } else return false;
    }

    public static boolean isPrime(float n) {
        if (n == (int) n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        } else return false;
    }

    public static boolean isPrime(double n) {
        if (n == (int) n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println("-------INT--------");
        System.out.println(isPrime(12));
        System.out.println(isPrime(7));
        System.out.println("--------LONG---------");
        System.out.println(isPrime(107));
        System.out.println(isPrime(112));
        System.out.println("---------FLOAT--------");
        System.out.println(isPrime(10.7f));
        System.out.println(isPrime(11.2f));
        System.out.println("---------DOUBLE---------");
        System.out.println(isPrime(10.70112));
        System.out.println(isPrime(11.20107));
    }
}
