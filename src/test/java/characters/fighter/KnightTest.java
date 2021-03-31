package characters.fighter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public  void before() {
        knight = new Knight("John", 100, 100);
    }

    @Test
    public void getName() {
        assertEquals("John", knight.getName());
    }

    @Test
    public void setName() {
        knight.setName("Jan");
        assertEquals("Jan", knight.getName());
    }

    @Test
    public void getMaxHealth() {
        assertEquals(100, knight.getMaxHealth());
    }

    @Test
    public void setMaxHealth() {
        knight.setMaxHealth(150);
        assertEquals(150, knight.getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        assertEquals(100, knight.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        knight.setCurrentHealth(30);
        assertEquals(30, knight.getCurrentHealth());
    }
}
