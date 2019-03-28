package itemTests;

import enums.potionType;
import items.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class potionTest {

    Potion potion;

    @Before
    public void setUp() {
        potion = new Potion(potionType.HEALTH, 30);
    }

    @Test
    public void hasType() {
        assertEquals(potionType.HEALTH, potion.getType());
    }

    @Test
    public void hasValue() {
        assertEquals(30, potion.getValue());
    }
}
