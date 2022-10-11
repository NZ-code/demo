package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HeroStorage {


    public List<Profession> professions = new ArrayList<>();
    public List<Character> characters = new ArrayList<>();


}
