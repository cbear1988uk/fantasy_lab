package RoomTests;

import Rooms.TreasureRoom;
import enums.fighterType;
import heroes.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Fighter fighter;

    @Before
    public void setUp(){
        treasureRoom = new TreasureRoom();
        fighter = new Fighter("Gimli", fighterType.DWARF);
    }

//    @Test
//    public void randomNumber(){
//        System.out.println(treasureRoom.getGoldAmount());
//        System.out.println(treasureRoom.getGoldAmount());
//        System.out.println(treasureRoom.getGoldAmount());
//        System.out.println(treasureRoom.getGoldAmount());
//    }

    @Test
    public void canBeCleared(){
        fighter.takeGold(treasureRoom.removeGold());
        assertEquals(true, treasureRoom.isClear());

    }
}
