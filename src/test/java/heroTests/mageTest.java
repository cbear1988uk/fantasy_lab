package heroTests;

import enemies.Goblin;
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
    Goblin goblin;

    @Before
    public void setUp() {
        mage = new Mage("Harry Potter", mageType.WIZARD);
        spell = new Spell("Fireball", 40);
        companion = new Companion("Gibberling", 10);
        goblin = new Goblin();
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

    @Test
    public void canAttack(){
        mage.addSpell(spell);
        mage.attack(goblin);
        assertEquals(10, goblin.getHitPoints());
    }

//    @Test
//    public void canBlockSomeDamage(){
//        goblin.attack(mage);
//        assertEquals(90, mage.getHitPoints());
//    }

}
