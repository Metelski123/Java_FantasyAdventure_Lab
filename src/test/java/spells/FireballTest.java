package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;

    @Before
    public void before() {
        fireball = new Fireball(20);
    }

    @Test
    public void canCastSpell() {
        assertEquals(20, fireball.castSpell());
    }

}
