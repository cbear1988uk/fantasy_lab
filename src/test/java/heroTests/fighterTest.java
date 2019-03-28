package heroTests;

import enemies.Goblin;
import enums.fighterType;
import enums.weaponType;
import heroes.Fighter;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class fighterTest {

    Fighter fighter;
    Weapon weapon;
    Goblin goblin;

    @Before
    public void setUp() {
        fighter = new Fighter("Gimli", fighterType.DWARF);
        weapon = new Weapon("Death Bringer", weaponType.SWORD, 10);
        goblin = new Goblin();

    }

    @Test
    public void hasName(){
        assertEquals("Gimli", fighter.getName());
    }

    @Test
    public void hasType(){
        assertEquals(fighterType.DWARF, fighter.getType());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(150, fighter.getHitPoints());
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(27, fighter.getBaseDamage());
    }

    @Test
    public void canAddWeapon(){
        fighter.addWeapon(weapon);
        assertEquals(weapon, fighter.getWeapon());
    }

    @Test
    public void canAttackEnemy(){
        fighter.addWeapon(weapon);
        fighter.attack(goblin);
        assertEquals(13, goblin.getHitPoints());
    }

    @Test
    public void canIncreaseHealth(){
        fighter.increaseHealth(100);
        assertEquals(250, fighter.getHitPoints());
    }

    @Test
    public void canDecreaseHealth(){
        fighter.reduceHealth(100);
        assertEquals(50, fighter.getHitPoints());
    }

    @Test
    public void startsWithNoGold(){
        assertEquals(0, fighter.getGold());
    }

}
