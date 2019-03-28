package Rooms;

import enemies.Enemy;
import enemies.Goblin;

import java.util.ArrayList;

public class EnemyRoom {

    private Enemy enemy;
    private boolean isClear;

    public EnemyRoom(Enemy enemy) {
        this.isClear = false;
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
