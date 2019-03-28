package RoomTests;

import Rooms.EnemyRoom;
import enemies.Goblin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Goblin goblin;

    @Before
    public void setUp(){
        goblin = new Goblin();
        enemyRoom = new EnemyRoom(goblin);
    }

    @Test
    public void hasEnemy(){
        assertEquals(goblin, enemyRoom.getEnemy());
    }
}
