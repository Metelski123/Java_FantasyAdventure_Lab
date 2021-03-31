package healing;

import Behaviours.IHeal;

public class Herb implements IHeal {

    private int healing;

    public Herb(int healing) {
        this.healing = healing;
    }

    public int healHealth() {
        return this.healing;
    }
}
