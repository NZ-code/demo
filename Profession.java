package com.example.demo;




public class Profession {
    String name;
    double moveSpeed;
    int baseArmor;

    public Profession(String name, double moveSpeed, int baseArmor) {
        this.name = name;
        this.moveSpeed = moveSpeed;
        this.baseArmor = baseArmor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(int baseArmor) {
        this.baseArmor = baseArmor;
    }
}
