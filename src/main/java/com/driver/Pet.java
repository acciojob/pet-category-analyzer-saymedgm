package com.driver;

public class Pet {
    private String name;
    private int lifespan;
    private String dietaryNeeds;
    private int maintenanceLevel;

    public Pet(String name, int lifespan, String dietaryNeeds, int maintenanceLevel) {
        this.name = name;
        this.lifespan = lifespan;
        this.dietaryNeeds = dietaryNeeds;
        this.maintenanceLevel = maintenanceLevel;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getDietaryNeeds() {
        return dietaryNeeds;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    // You can add more getters and setters as needed
}