package heroes;

public abstract class Hero {

    private String name;
    private int hitPoints;
    private int gold;

    public Hero(String name, Integer hitPoints){
        this.name = name;
        this.hitPoints = hitPoints;
        this.gold = 0;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void reduceHealth(int amount){
        if (amount > 0){
            this.hitPoints -= amount;
        }
    }

    public void increaseHealth(int amount){
        if (amount > 0){
            this.hitPoints += amount;
        }
    }

    public int getGold() {
        return gold;
    }

    public void takeGold(int amount){
        this.gold += amount;
    }
}
