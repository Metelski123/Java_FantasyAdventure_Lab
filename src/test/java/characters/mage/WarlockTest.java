package characters.mage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Mark", 100, 100);
    }

    @Test
    public void getName() {
        assertEquals("Mark", warlock.getName());
    }

    @Test
    public void setName() {
        warlock.setName("Jan");
        assertEquals("Jan", warlock.getName());
    }

    @Test
    public void getMaxHealth() {
        assertEquals(100, warlock.getMaxHealth());
    }

    @Test
    public void setMaxHealth() {
        warlock.setMaxHealth(150);
        assertEquals(150, warlock.getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        assertEquals(100, warlock.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        warlock.setCurrentHealth(30);
        assertEquals(30, warlock.getCurrentHealth());
    }
}
