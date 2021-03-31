package characters.mage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public  void before() {
        wizard = new Wizard("John", 100, 100);
    }

    @Test
    public void getName() {
        assertEquals("John", wizard.getName());
    }

    @Test
    public void setName() {
        wizard.setName("Jan");
        assertEquals("Jan", wizard.getName());
    }

    @Test
    public void getMaxHealth() {
        assertEquals(100, wizard.getMaxHealth());
    }

    @Test
    public void setMaxHealth() {
        wizard.setMaxHealth(150);
        assertEquals(150, wizard.getMaxHealth());
    }

    @Test
    public void getCurrentHealth() {
        assertEquals(100, wizard.getCurrentHealth());
    }

    @Test
    public void setCurrentHealth() {
        wizard.setCurrentHealth(30);
        assertEquals(30, wizard.getCurrentHealth());
    }

    @Test
    public void canCastSpell() {

    }

}
