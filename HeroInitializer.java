package com.example.demo;

import jdk.jfr.Percentage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HeroInitializer {
    private CharacterService characterService;
    private ProfessionService professionService;

    @Autowired
    public HeroInitializer(CharacterService characterService, ProfessionService professionService){
        this.characterService = characterService;
        this.professionService = professionService;
    }
    @PostConstruct
    private synchronized void init(){
        Profession profession = new Profession("Builder", 12, 12);
        Profession profession2 = new Profession("Warrior", 2, 6);
        Character character = new Character("Nick",profession, 12 );
        Character character2 = new Character("Mike",profession2, 55 );

        professionService.saveProfession(profession);
        professionService.saveProfession(profession2);

        characterService.saveCharacter(character);
        characterService.saveCharacter(character2);

    }
}
