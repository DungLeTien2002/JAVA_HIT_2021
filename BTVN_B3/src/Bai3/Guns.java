package Bai3;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public void Load(int x)
    {
        ammoNumber=ammoNumber+x;
    }
    public void Shoot(int x)
    {
        if(ammoNumber-x<0) System.out.println("  Weapon out of ammo");
        else ammoNumber-=x;
    }
    public Guns(){}
    public Guns(String weaponName,int ammoNumber)
    {
        this.ammoNumber=ammoNumber;
        this.weaponName=weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
