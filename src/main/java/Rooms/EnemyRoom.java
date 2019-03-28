package Rooms;

import Interfaces.IClear;
import enemies.Enemy;
import enemies.Goblin;

import java.util.ArrayList;

public class EnemyRoom implements IClear {

    private Enemy enemy;
    private boolean isClear;

    public EnemyRoom(Enemy enemy) {
        this.isClear = false;
        this.enemy = enemy;
    }

    public boolean isClear() {
        return isClear;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void checkIfClear() {
        if (enemy.getHitPoints() <= 0){
            this.isClear = true;
        }
    }
}
