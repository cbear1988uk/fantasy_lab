package enemies;

import heroes.Hero;

public abstract class Enemy {

    private int hitPoints;
    private int damage;

    public Enemy(int hitPoints, int damage){

        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void reduceHealth(int amount){
        if (amount > 0){
            this.hitPoints -= amount;
        }
    }

    public void attack(Hero hero){
        hero.reduceHealth(this.damage);
    }



}
