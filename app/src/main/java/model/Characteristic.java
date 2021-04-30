package model;

public enum Characteristic {
    STRENGTH("Strength"),
    ENDURANCE("Endurance"),
    AGILITY("Agility"),
    INTELLIGENCE("Intelligence"),
    WILLPOWER("Willpower"),
    PERCEPTION("Perception"),
    PERSONALITY("Personality"),
    LUCK("Luck");

    private final String name;
    private int value;
    private int bonus;

    Characteristic(String name) {
        this.name = name;
        this.value = 0;
        this.bonus = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.bonus = (int) Math.floor(value / 10);
    }

    public int getBonus() {
        return bonus;
    }
}
