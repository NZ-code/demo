package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    CharacterDao repository;
    @Autowired
    public CharacterService(CharacterDao repository){
        this.repository = repository;
    }

    void saveCharacter(Character character) {
        repository.saveCharacter(character);
    }
    void deleteCharacter(Character character){
        repository.deleteCharacter(character);
    }

    List<Character> findAllCharacters(){
        return  repository.findAllCharacters();
    }
    Character findByName(String name){
        return  repository.findByName(name);
    }
}
