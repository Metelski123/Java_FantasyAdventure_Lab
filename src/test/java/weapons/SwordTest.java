package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before() {
        sword = new Sword(100);
    }

    @Test
    public void getDamage() {
        assertEquals(100, sword.attack());
    }
}
