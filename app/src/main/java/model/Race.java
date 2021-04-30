package model;

import java.util.List;

public class Race {
    private final int strength;
    private final int endurance;
    private final int agility;
    private final int intelligence;
    private final int willpower;
    private final int perception;
    private final int personality;
    private final List<Trait> traits;
    private final List<Magic> powers;

    public Race(int strength, int endurance, int agility, int intelligence, int willpower, int perception, int personality, List<Trait> traits, List<Magic> powers) {
        this.strength = strength;
        this.endurance = endurance;
        this.agility = agility;
        this.intelligence = intelligence;
        this.willpower = willpower;
        this.perception = perception;
        this.personality = personality;

        this.traits = traits;
        this.powers = powers;
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

    public List<Trait> getTraits() {
        return traits;
    }

    public List<Magic> getPowers() {
        return powers;
    }
}
