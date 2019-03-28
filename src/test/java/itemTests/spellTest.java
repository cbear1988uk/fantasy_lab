package itemTests;

import org.junit.Before;
import org.junit.Test;
import items.Spell;

import static org.junit.Assert.assertEquals;

public class spellTest {

    Spell spell;

    @Before
    public void setUp() {
        spell = new Spell("Fireball", 40);
    }

    @Test
    public void hasName(){
        assertEquals("Fireball", spell.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(40, spell.getDamage());
    }
}
