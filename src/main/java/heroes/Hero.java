package heroes;

public abstract class Hero {

    private String name;
    private int hitPoints;

    public Hero(String name, Integer hitPoints){
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
