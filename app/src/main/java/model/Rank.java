package model;

public enum Rank {
    UNTRAINED("Untrained", -10, 0, 0),
    NOVICE("Novice", 0, 100, 25),
    APPRENTICE("Apprentice", 10, 200, 30),
    JOURNEYMAN("Journeyman", 20, 300, 35),
    ADEPT("Adept", 30, 400, 40),
    EXPERT("Expert", 40, 500, 45),
    MASTER("Master", 50, 800, 50);

    private final String name;
    private final int bonus;
    private final int cost;
    private final int requirement;

    Rank(String name, int bonus, int cost, int requirement) {
        this.name = name;
        this.bonus = bonus;
        this.cost = cost;
        this.requirement = requirement;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public int getCost() {
        return cost;
    }

    public int getRequirement() {
        return requirement;
    }
}
