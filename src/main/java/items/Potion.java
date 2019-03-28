package items;

import enums.potionType;

public class Potion {

    private potionType type;
    private int value;

    public Potion(potionType type, int value) {
        this.type = type;
        this.value = value;
    }

    public potionType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }


}
