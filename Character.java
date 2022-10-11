package com.example.demo;


public class Character {
    String name;
    Profession profession;
    int level;

    public Character(String name, Profession profession, int level) {
        this.name = name;
        this.profession = profession;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
