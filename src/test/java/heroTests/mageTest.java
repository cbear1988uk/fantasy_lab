package heroTests;

import enums.mageType;
import heroes.Mage;
import org.junit.Before;
import org.junit.Test;
import items.Companion;
import items.Spell;

import static org.junit.Assert.assertEquals;

public class mageTest {

    Mage mage;
    Spell spell;
    Companion companion;

    @Before
    public void setUp() {
        mage = new Mage("Harry Potter", mageType.WIZARD);
        spell = new Spell("Fireball", 40);
        companion = new Companion("Gibberling", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Harry Potter", mage.getName());
    }

    @Test
    public void hasType() {
        assertEquals(mageType.WIZARD, mage.getType());
    }

    @Test
    public void canAddSpell(){
        mage.addSpell(spell);
        assertEquals(spell, mage.getSpell());
    }

    @Test
    public void canAddCompanion(){
        mage.addCompanion(companion);
        assertEquals(companion, mage.getCompanion());
    }

}
