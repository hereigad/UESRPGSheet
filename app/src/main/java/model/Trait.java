package model;

public class Trait {
    private final String name;
    private final String description;
    private final String attribute;
    private final String modifier;

    public Trait(String name, String description, String attribute, String modifier) {
        this.name = name;
        this.description = description;
        this.attribute = attribute;
        this.modifier = modifier;
    }

    public String getName() {
        String name = this.name;
        if(modifier != null && attribute != null) {
            name = name + "(" + attribute + ", " + modifier + ")";
        } else {
            if(modifier != null) {
                name = name + "(" + modifier + ")";
            }
            if(attribute != null) {
                name = name + "(" + attribute + ")";
            }
        }
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getModifier() {
        return modifier;
    }
}
