package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDao{
    private HeroStorage storage;
    @Autowired
    public CharacterDao(HeroStorage heroStorage){
        storage = heroStorage;
    }

    void saveCharacter(Character character){
        storage.characters.add(character);
    }
    void deleteCharacter(Character character){
        storage.characters.remove(character);
    }
    
    List<Character> findAllCharacters(){
        return storage.characters;
    }
    Character findByName(String name){
        return storage.characters.get(0);
    }

}
