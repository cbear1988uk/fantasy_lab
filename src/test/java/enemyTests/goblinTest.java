package enemyTests;

import enemies.Goblin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class goblinTest {

    Goblin goblin;

    @Before
    public void setUp() {
        goblin = new Goblin();
    }

    @Test
    public void hasHitPoints(){
        assertEquals(50, goblin.getHitPoints());
    }

    @Test
    public void hasDamage() {
        assertEquals(40, goblin.getDamage());
    }

    @Test
    public void canReduceHealth(){
        goblin.reduceHealth(30);
        assertEquals(20, goblin.getHitPoints());
    }
}
