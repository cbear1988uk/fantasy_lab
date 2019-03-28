package heroes;

import enemies.Enemy;
import enemies.Goblin;
import enums.mageType;
import items.Companion;
import items.Spell;

public class Mage extends Hero {

    private mageType type;
    private Spell spell;
    private Companion companion;

    public Mage(String name, mageType type){
        super(name, 120);
        this.type = type;
    }

    public mageType getType() {
        return type;
    }

    public void addSpell(Spell spell) {
        this.spell = spell;
    }

    public void addCompanion(Companion companion) {
        this.companion = companion;
    }

    public Spell getSpell() {
        return spell;
    }

    public Companion getCompanion() {
        return companion;
    }

    public void attack(Enemy enemy) {
        enemy.reduceHealth(this.spell.getDamage());
    }

}
