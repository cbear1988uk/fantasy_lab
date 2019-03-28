package Rooms;

import java.util.Random;

public class TreasureRoom {
    private int goldAmount;
    private boolean isClear;

    public TreasureRoom() {
        this.goldAmount = this.randomAmount();
        this.isClear = false;
    }

    public int getGoldAmount(){
        return this.goldAmount;
    }

    public int randomAmount(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
