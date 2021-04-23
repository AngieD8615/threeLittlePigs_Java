package com.company;
public class Wolf extends Character {
    public Wolf(String name, boolean isKind) {
        super(name, isKind);
    }
    public void walkTo() {
        setLocation(getLocation() + 1);
        System.out.println("The wolf is at location " + getLocation());
    }
    public void walkTo(int location) {
        setLocation(location);
        System.out.println("The wolf is at location " + getLocation());
    }
    public void knock (int houseIndex) {
        System.out.println("Wolf is knocking on house at address: " + houseIndex);
    }
    public void blowOnTheHouse (int houseIndex) {
        // check the material
        // if the material is straw or wood
        // blows the house down -> changes the property in the house
        if (Story.houses.get(houseIndex).getMaterial().getDurability() < 3) {
            Story.houses.get(houseIndex).setBlownDown(true);
            System.out.println("the house at " + houseIndex + " has been blown down");
        } else {
            System.out.println("the house at " + houseIndex + " cannot be blown down");
        }
    }
}