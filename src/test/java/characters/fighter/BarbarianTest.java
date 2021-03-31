package characters.fighter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public  void before() {
        barbarian = new Barbarian("John", 100, 100);
    }

    @Test
    public void getName() {
        assertEquals("John", barbarian.getName());
    }

    @Test
    public void setName() {
        barbarian.setName("Jan");
        assertEquals("Jan", barbarian.getName());
    }

    @Test
    public void getMaxHealth() {
        assertEquals(100, barbarian.getMaxHealth());
    }

    @Test
    public void setMaxHealth() {
        barbarian.setMaxHealth(150);
        assertEquals(150, barbarian.getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        assertEquals(100, barbarian.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        barbarian.setCurrentHealth(30);
        assertEquals(30, barbarian.getCurrentHealth());
    }
}
