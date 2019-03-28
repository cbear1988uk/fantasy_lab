package enemyTests;

import enemies.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void setUp(){
        dragon = new Dragon();
    }

    @Test
    public void hasHitPoints(){
        assertEquals(150, dragon.getHitPoints());
    }

    @Test
    public void hasDamage(){
        assertEquals(80, dragon.getDamage());
    }
}
