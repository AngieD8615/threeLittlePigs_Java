
package com.company;
public class Material {
    private String type;
    private int durability;
    public Material (String type, int durability) {
        this.type = type;
        this.durability = durability;
    }
    public String getType() {
        return type;
    }
    public int getDurability() {
        return durability;
    }
}