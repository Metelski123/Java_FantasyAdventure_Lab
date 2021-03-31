package characters.cleric;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public  void before() {
        cleric = new Cleric("John", 100, 100);
    }

    @Test
    public void getName() {
        assertEquals("John", cleric.getName());
    }

    @Test
    public void setName() {
        cleric.setName("Jan");
        assertEquals("Jan", cleric.getName());
    }

    @Test
    public void getMaxHealth() {
        assertEquals(100, cleric.getMaxHealth());
    }

    @Test
    public void setMaxHealth() {
        cleric.setMaxHealth(150);
        assertEquals(150, cleric.getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        assertEquals(100, cleric.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        cleric.setCurrentHealth(30);
        assertEquals(30, cleric.getCurrentHealth());
    }
}
