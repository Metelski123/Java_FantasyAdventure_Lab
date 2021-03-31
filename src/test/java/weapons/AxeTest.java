package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before() {
        axe = new Axe(50);
    }

    @Test
    public void getDamage() {
        assertEquals(50, axe.attack());
    }
}
