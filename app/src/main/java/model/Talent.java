package model;

import java.util.List;

public class Talent {
    private final String name;
    private final Rank rank;
    private final List<Characteristic> governingCharacteristics;
    private final List<Skill> requiredSkills;
    private final List<Talent> requiredTalents;
    private final String description;

    public Talent(String name, Rank rank, List<Characteristic> governingCharacteristics, List<Skill> requiredSkills, List<Talent> requiredTalents, String description) {
        this.name = name;
        this.rank = rank;
        this.governingCharacteristics = governingCharacteristics;
        this.requiredSkills = requiredSkills;
        this.requiredTalents = requiredTalents;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public List<Characteristic> getGoverningCharacteristics() {
        return governingCharacteristics;
    }

    public List<Skill> getRequiredSkills() {
        return requiredSkills;
    }

    public List<Talent> getRequiredTalents() {
        return requiredTalents;
    }

    public String getDescription() {
        return description;
    }
}
