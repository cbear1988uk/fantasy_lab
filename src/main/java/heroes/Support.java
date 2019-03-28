package heroes;

import enemies.Enemy;
import enemies.Goblin;
import enums.potionType;
import items.Potion;

public class Support extends Hero {

   private Potion potion;

    public Support(String name) {
        super(name, 90);
    }

    public Potion getPotion(){
        return this.potion;
    }

    public void addPotion(Potion potion){
        this.potion = potion;
    }

    public void heal(Fighter fighter) {
        if (potion.getType() == potionType.HEALTH){
            fighter.increaseHealth(potion.getValue());
        }
    }

    public void poison(Enemy enemy) {
        if (potion.getType() == potionType.POISON){
            enemy.reduceHealth(potion.getValue());
        }
    }
}
