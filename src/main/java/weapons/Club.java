package weapons;

import Behaviours.IWeapon;

public class Club implements IWeapon {

    private int damage;

    public Club(int damage) {
        this.damage = damage;
    }

    public int attack() {
        return damage;
    }
}
