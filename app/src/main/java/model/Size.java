package model;

public enum Size {
    PUNY("Puny"),
    TINY("Tiny"),
    SMALL("Small"),
    STANDARD("Standard"),
    LARGE("Large"),
    HUGE("Huge"),
    ENORMOUS("Enormous");

    private final String name;

    Size(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
