package itemTests;

import org.junit.Before;
import org.junit.Test;
import items.Companion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class companionTest {

    Companion companion;

    @Before
    public void setUp() {
        companion = new Companion("Gibberling", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Gibberling", companion.getName());
    }

    @Test
    public void hasAbsorbDamageAmount(){
        assertEquals(10, companion.getAbsorbDamageAmount());
    }
}
