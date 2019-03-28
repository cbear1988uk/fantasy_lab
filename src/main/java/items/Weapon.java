package items;

import enums.weaponType;

public class Weapon {

    private String name;
    private weaponType type;
    private int damage;

    public Weapon(String name, weaponType type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public weaponType getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
