package model;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private Characteristic strength;
    private Characteristic endurance;
    private Characteristic agility;
    private Characteristic intelligence;
    private Characteristic willpower;
    private Characteristic perception;
    private Characteristic personality;
    private Characteristic luck;
    private Pair<Characteristic, Characteristic> favoured;
    private Attribute healthPoints;
    private Attribute stamina;
    private Attribute magicka;
    private Attribute linguistics;
    private Attribute initiative;
    private Size size;
    private Attribute speed;
    private Attribute carryRating;
    private Attribute actionPoints;
    private Attribute luckPoints;
    private int experience;
    private List<Skill> skills;
    private List<Talent> talents;
    private List<Trait> traits;
    private List<Magic> powers;
    private List<Magic> rituals;
    private List<Magic> spells;
    private Race race;
    private BirthSign birthsign;

    public Character(Race race, BirthSign birthSign, int strength, int endurance, int agility, int intelligence, int willpower, int perception, int personality, int luck, Pair<Characteristic, Characteristic> favoured) {
        this.race = race;
        this.birthsign = birthSign;

        this.strength = Characteristic.STRENGTH;
        this.strength.setValue(race.getStrength() + birthSign.getStrength() + strength);

        this.endurance = Characteristic.ENDURANCE;
        this.endurance.setValue(race.getEndurance() + birthSign.getEndurance() + endurance);

        this.agility = Characteristic.AGILITY;
        this.agility.setValue(race.getAgility() + birthSign.getAgility() + agility);

        this.intelligence = Characteristic.INTELLIGENCE;
        this.intelligence.setValue(race.getIntelligence() + birthSign.getIntelligence() + intelligence);

        this.willpower = Characteristic.WILLPOWER;
        this.willpower.setValue(race.getWillpower() + birthSign.getWillpower() + willpower);

        this.perception = Characteristic.PERCEPTION;
        this.perception.setValue(race.getPerception() + birthSign.getPerception() + perception);

        this.personality = Characteristic.PERSONALITY;
        this.personality.setValue(race.getPersonality() + birthSign.getPersonality() + personality);

        this.luck = Characteristic.LUCK;
        this.luck.setValue(luck);

        this.healthPoints = Attribute.HEALTH_POINTS;
        this.healthPoints.initialize((int) Math.ceil(this.endurance.getValue() / 2));

        this.stamina = Attribute.STAMINA;
        this.stamina.initialize(this.endurance.getBonus());

        this.magicka = Attribute.MAGICKA;
        this.magicka.initialize(this.intelligence.getValue());

        this.linguistics = Attribute.LINGUISTICS;
        this.linguistics.initialize((int) Math.ceil(this.intelligence.getBonus() / 2));

        this.initiative = Attribute.INITIATIVE;
        this.initiative.initialize(this.agility.getBonus() + this.intelligence.getBonus() + this.perception.getBonus());

        this.speed = Attribute.SPEED;
        this.speed.initialize(this.strength.getBonus() + 2 * this.agility.getBonus());

        this.carryRating = Attribute.CARRY_RATING;
        this.carryRating.initialize(4 * this.strength.getBonus() + 2 * this.endurance.getBonus());

        this.actionPoints = Attribute.ACTION_POINTS;
        this.actionPoints.initialize(3);

        this.luckPoints = Attribute.LUCK_POINTS;
        this.luckPoints.initialize(this.luck.getBonus());

        this.experience = 0;
        this.favoured = favoured;
        this.size = Size.STANDARD;

        this.skills = new ArrayList<>();
        this.talents = new ArrayList<>();
        this.powers = new ArrayList<>();
        this.traits = new ArrayList<>();
        this.rituals = new ArrayList<>();
        this.spells = new ArrayList<>();

        this.powers.addAll(race.getPowers());
        this.powers.addAll(birthSign.getPowers());

        this.traits.addAll(race.getTraits());
        this.traits.addAll(birthSign.getTraits());
    }
}
