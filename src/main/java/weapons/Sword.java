package weapons;

import Behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damage;

    public Sword(int damage) {
        this.damage = damage;
    }

    public int attack() {
        return damage;
    }
}
