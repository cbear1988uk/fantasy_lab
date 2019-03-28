package Rooms;

import Interfaces.IClear;

import java.util.Random;

public class TreasureRoom implements IClear {
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

    public boolean isClear() {
        return isClear;
    }

    public int removeGold() {
        int gold = this.goldAmount;
        this.goldAmount = 0;
        this.isClear = true;
        return gold;
    }
}
