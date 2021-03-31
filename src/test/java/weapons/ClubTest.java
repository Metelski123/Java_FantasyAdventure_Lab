package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before() {
        club = new Club(100);
    }

    @Test
    public void getDamage() {
        assertEquals(100, club.attack());
    }
}
