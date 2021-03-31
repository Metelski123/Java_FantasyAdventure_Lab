package healing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;

    @Before
    public void before() {
        potion = new Potion(60);
    }

    @Test
    public void canHeal() {
        assertEquals(60, potion.healHealth());
    }

}
