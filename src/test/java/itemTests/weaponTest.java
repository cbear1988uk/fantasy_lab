package itemTests;

import enums.weaponType;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class weaponTest {

    Weapon weapon;

    @Before
    public void setUp() {
        weapon = new Weapon("Death Bringer", weaponType.SWORD, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Death Bringer", weapon.getName());
    }

    @Test
    public void hasType() {
        assertEquals(weaponType.SWORD, weapon.getType());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, weapon.getDamage());
    }
}
