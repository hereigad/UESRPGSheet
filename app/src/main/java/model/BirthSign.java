package model;

import java.util.List;

public class BirthSign {
    private final String name;
    private final int strength;
    private final int endurance;
    private final int agility;
    private final int intelligence;
    private final int willpower;
    private final int perception;
    private final int personality;
    private final int stamina;
    private final int speed;
    private final List<Trait> traits;
    private final List<Magic> powers;

    public BirthSign(String name, int strength, int endurance, int agility, int intelligence, int willpower, int perception, int personality, int stamina, int speed, List<Trait> traits, List<Magic> powers) {
        this.name = name;
        this.strength = strength;
        this.endurance = endurance;
        this.agility = agility;
        this.intelligence = intelligence;
        this.willpower = willpower;
        this.perception = perception;
        this.personality = personality;
        this.stamina = stamina;
        this.speed = speed;
        this.traits = traits;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWillpower() {
        return willpower;
    }

    public int getPerception() {
        return perception;
    }

    public int getPersonality() {
        return personality;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public List<Magic> getPowers() {
        return powers;
    }
}
