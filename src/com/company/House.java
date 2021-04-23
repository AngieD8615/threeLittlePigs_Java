package com.company;
public class House {
    private Material material;
    private int timeToBuild;
    private boolean isBlownDown = false;
    private String builder;
    private boolean isComplete = false;
    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean complete) {
        isComplete = complete;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public int getTimeToBuild() {
        return timeToBuild;
    }
    public void setTimeToBuild(int timeToBuild) {
        this.timeToBuild = timeToBuild;
    }
    public boolean getIsBlownDown() {
        return isBlownDown;
    }
    public Material getMaterial() {
        return material;
    }
    public String getBuilder() {
        return builder;
    }
    public void setBlownDown(boolean blownDown) {
        isBlownDown = blownDown;
    }
    public House (Material material, int timeToBuild, String builder) {
        this.material = material;
        this.timeToBuild = timeToBuild;
        this.builder = builder;
    }
}
