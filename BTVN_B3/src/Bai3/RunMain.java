package Bai3;

import java.util.Random;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Guns s1=new Guns();
        Guns s2= new Guns();
        s1.setWeaponName("DiepBeDe");
        s1.setAmmoNumber(100);
        s2.setWeaponName("DoanXinhGai");
        s2.setAmmoNumber(100);
        Random rd=new Random();
        while (s1.getAmmoNumber()!=0&&s2.getAmmoNumber()!=0)
        {
            s1.Shoot(rd.nextInt(10));
            s2.Shoot(rd.nextInt(10));
            if(s1.getAmmoNumber()==0&&s2.getAmmoNumber()==0)
            {
                System.out.println("reload ammo");
                s1.Load(rd.nextInt(10));
                s2.Load(rd.nextInt(10));
            }
            else
            {
                if(s1.getAmmoNumber()==0)
                {
                    System.out.println("DiepBeDe die");
                    break;
                }
                if(s2.getAmmoNumber()==0) {
                    System.out.println("DoanXinhGai die");

                break;}
            }
        }
    }
}
