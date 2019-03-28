package heroTests;

import enemies.Goblin;
import enums.fighterType;
import enums.potionType;
import heroes.Fighter;
import heroes.Support;
import items.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class supportTest {

    Support support;
    Potion potion;
    Fighter fighter;
    Goblin goblin;

    @Before
    public void setUp() {
        support = new Support("Bob");
        fighter = new Fighter("Gimli", fighterType.DWARF);
        potion = new Potion(potionType.HEALTH, 30);
        goblin = new Goblin();
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

    @Test
    public void canHealHeroes(){
        support.addPotion(potion);
        support.heal(fighter);
        assertEquals(180, fighter.getHitPoints());
    }

    @Test
    public void canPoisonEnemies(){
        Potion potion = new Potion(potionType.POISON, 20);
        support.addPotion(potion);
        support.poison(goblin);
        assertEquals(30, goblin.getHitPoints());
    }
}
