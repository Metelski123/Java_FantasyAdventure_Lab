package healing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    Herb herb;

    @Before
    public void before() {
        herb = new Herb(30);
    }

    @Test
    public void canHeal() {
        assertEquals(30, herb.healHealth());
    }

}
