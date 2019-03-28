package heroTests;

import enums.potionType;
import heroes.Support;
import items.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class supportTest {

    Support support;
    Potion potion;

    @Before
    public void setUp() {
        support = new Support("Bob");
        potion = new Potion(potionType.HEALTH, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", support.getName());
    }

    @Test
    public void canAddItem(){
        support.addPotion(potion);
        assertEquals(potion, support.getPotion());
    }
}
