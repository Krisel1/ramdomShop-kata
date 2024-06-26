package org.example;


public class Gourmet {
    private final Integer age;
    private final boolean isStinky;


    public Gourmet(Integer age, boolean isStinky) {
        this.age = age;
        this.isStinky = isStinky;

    }

    public Integer getAge() {
        return age;
    }

    public boolean isStinky() {
        return isStinky;
    }


    public double calculatePrice() {
            if (this.isStinky()) {
                return 10.0 * getAge();
            } else {
                return 20.0 * getAge();
            }

    }
}




