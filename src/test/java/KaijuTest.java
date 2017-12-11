import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Lizard lizard1;
    Lizard lizard2;
    Tank tank1;
    Tank tank2;
    Kaiju kaiju;

    @Before
    public void before() {
      lizard1 = new Lizard("Steve", 2, 10);
      lizard2 = new Lizard("Woz", 9, 4);
      tank1 = new Tank("Big tank", 10);
      tank2 = new Tank("Small tank", 8);
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(2, lizard1.getHealthValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roar!", lizard1.roar());
    }

}
