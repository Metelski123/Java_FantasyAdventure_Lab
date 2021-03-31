package spells;

import Behaviours.ISpell;

public class MagicMissile implements ISpell {

    private int power;

    public MagicMissile(int power) {
        this.power = power;
    }

    public int castSpell() {
        return this.power;
    }
}
