package items;

public class Companion {

    private String name;
    private int absorbAmount;

    public Companion(String name, int absorbAmount) {
        this.name = name;
        this.absorbAmount = absorbAmount;
    }

    public String getName() {
        return name;
    }

    public int getAbsorbDamageAmount() {
        return absorbAmount;
    }
}
