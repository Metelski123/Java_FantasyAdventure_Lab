package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicMissileTest {

    MagicMissile magicMissile;

    @Before
    public void before() {
        magicMissile = new MagicMissile(40);
    }

    @Test
    public void canCastSpell() {
        assertEquals(40, magicMissile.castSpell());
    }
}
