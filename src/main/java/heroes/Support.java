package heroes;

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

}
