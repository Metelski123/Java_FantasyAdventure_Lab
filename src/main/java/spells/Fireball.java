package spells;

import Behaviours.ISpell;

public class Fireball implements ISpell {

    private int power;
    private int fireball;

    public Fireball(int power) {
        this.power = power;
    }

    public int castSpell() {
        return this.power;
    }


}
