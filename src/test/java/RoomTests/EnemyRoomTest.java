package RoomTests;

import Rooms.EnemyRoom;
import enemies.Goblin;
import enums.fighterType;
import enums.weaponType;
import heroes.Fighter;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Goblin goblin;
    Fighter fighter;
    Weapon weapon;

    @Before
    public void setUp(){
        goblin = new Goblin();
        enemyRoom = new EnemyRoom(goblin);
        fighter = new Fighter("Gimli", fighterType.DWARF);
        weapon = new Weapon("Death Bringer", weaponType.SWORD, 100);
    }

    @Test
    public void hasEnemy(){
        assertEquals(goblin, enemyRoom.getEnemy());
    }

    @Test
    public void canBeCleared(){
        fighter.addWeapon(weapon);
        fighter.attack(goblin);
        enemyRoom.checkIfClear();
        assertEquals(true, enemyRoom.isClear());

    }
}
