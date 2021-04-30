package model;

public enum Attribute {
    HEALTH_POINTS("Health Points"),
    STAMINA("Stamina"),
    MAGICKA("Magicka"),
    LINGUISTICS("Linguistics"),
    INITIATIVE("Initiative"),
    SPEED("Speed"),
    CARRY_RATING("Carry Rating"),
    ACTION_POINTS("Action Points"),
    LUCK_POINTS("Luck Points");


    private final String name;
    private int value;
    private int max;

    Attribute(String name) {
        this.name = name;
        this.max = 0;
        this.value = this.max;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value != this.max) {
            this.value = value;
        } else {
            this.value = max;
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void initialize(int value) {
        this.max = value;
        this.value = value;
    }
}
