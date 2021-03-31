package weapons;

import Behaviours.IWeapon;

public class Axe implements IWeapon {

    private int damage;

    public Axe(int damage) {
        this.damage = damage;
    }

    public int attack() {
        return damage;
    }
}
