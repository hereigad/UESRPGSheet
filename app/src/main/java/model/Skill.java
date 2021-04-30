package model;

import java.util.List;

public class Skill {
    private final String name;
    private final String field;
    private final Rank rank;
    private final List<Characteristic> governingCharacteristics;

    public Skill(String name, String field, Rank rank, List<Characteristic> governingCharacteristic) {
        this.name = name;
        this.field = field;
        this.rank = rank;
        this.governingCharacteristics = governingCharacteristic;
    }

    public String getName() {
        return name + " " + field;
    }

    public Rank getRank() {
        return rank;
    }

    public List<Characteristic> getGoverningCharacteristics() {
        return governingCharacteristics;
    }
}
