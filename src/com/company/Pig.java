package com.company;
public class Pig extends Character{
    private int age;
    public Pig(String name, boolean isKind, int age) {
        super(name, isKind);
        this.age = age;
        Main.pigs.add(this);
    }
    public void buildHouse(Material material, int timeToBuild) {
        House myHouse = new House(material, timeToBuild, name);
        Main.houses.add(myHouse);
        Main.pigsHouses.put(this, myHouse);
        location = Main.houses.indexOf(myHouse);
        System.out.println("Your " + material.getType() + " house is successfully built!");
    }
    public void play() {
        System.out.println(name + "is playing...");
    }
    public void runningToNextHouse() {
        location++;
        String nextPigName = Main.houses.get(location).getBuilder();
        System.out.println(name + " successfully made it to " + nextPigName + "'s house");
    }
}
