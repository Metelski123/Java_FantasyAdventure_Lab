package characters.fighter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public  void before() {
        dwarf = new Dwarf("John", 100, 100);
    }

    @Test
    public void getName() {
        assertEquals("John", dwarf.getName());
    }

    @Test
    public void setName() {
        dwarf.setName("Jan");
        assertEquals("Jan", dwarf.getName());
    }

    @Test
    public void getMaxHealth() {
        assertEquals(100, dwarf.getMaxHealth());
    }

    @Test
    public void setMaxHealth() {
        dwarf.setMaxHealth(150);
        assertEquals(150, dwarf.getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        assertEquals(100, dwarf.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        dwarf.setCurrentHealth(30);
        assertEquals(30, dwarf.getCurrentHealth());
    }
}
