package org.example;



public class Terrestrial {
    private final Integer numberOfLegs;
    private final String color;
    private final String name;
    private final boolean stinky;


    public Terrestrial(String color, Integer numberOfLegs, String name, boolean stinky) {
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.stinky = stinky;

    }

    public boolean isStinky() {
        return stinky;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getColor() {
        return color;
    }


    public String getName() {
        return name;
    }

    public double calculatePrice() {
        if ("Spiders".equals(this.getName())) {
            double basePrice = 1.2 * this.getNumberOfLegs();
            double extra = 0.0;

            if ("Red".equals(this.getColor())) {
                extra = 2.0;
            } else if ("Gold".equals(this.getColor())) {
                extra = 3.0;
            }

            if (this.isStinky()) {
                return (basePrice + extra) / 2.0;
            } else {
                return basePrice + extra;
            }
        } else if (this.getNumberOfLegs() != null) {
            return 4.2 * this.getNumberOfLegs();
        }
        return 0.0;
    }
}



