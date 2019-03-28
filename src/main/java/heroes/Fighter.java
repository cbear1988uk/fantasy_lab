package heroes;

import enemies.Enemy;
import enemies.Goblin;
import enums.fighterType;
import items.Weapon;

public class Fighter extends Hero{

    private fighterType type;
    private int baseDamage;
    private Weapon weapon;

    public Fighter(String name, fighterType type) {
        super(name, 150);
        this.type = type;
        this.baseDamage = 27;
    }

    public fighterType getType() {
        return type;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        int attackTotal = this.baseDamage + this.weapon.getDamage();
        enemy.reduceHealth(attackTotal);
    }
}
