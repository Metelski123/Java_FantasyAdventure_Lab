package characters;


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
        wizard = new Wizard("John", 50, 25);
        assertEquals(50, wizard.getMaxHealth());
        wizard.setMaxHealth(100);
        assertEquals(100, wizard.getMaxHealth());
    }

}
