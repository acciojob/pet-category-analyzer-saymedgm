package com.driver;

import java.util.HashMap;
import java.util.Map;

public class PetCategoryAnalyzer {
    private Map<String, Pet> pets;

    public PetCategoryAnalyzer() {
        this.pets = new HashMap<String, Pet>();
    }

    public void addPet(String name, int lifespan, String dietaryNeeds, int maintenanceLevel) {
        Pet pet = new Pet(name, lifespan, dietaryNeeds, maintenanceLevel);
        pets.put(name, pet);
    }

    public double calculatePopularityIndex(String petName) {
        Pet pet = pets.get(petName);

        if (pet == null) {
            System.out.println("Pet not found.");
            return -1;
        }

        // Advanced mathematical modeling for popularity index calculation
        double popularityIndex = (pet.getLifespan() * 0.4) + (pet.getMaintenanceLevel() * 0.3) + (pet.getDietaryNeeds().equals("Carnivore") ? 0.3 : 0.2);

        return popularityIndex;
    }
}