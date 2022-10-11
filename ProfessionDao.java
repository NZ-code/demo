package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfessionDao {
    private HeroStorage storage;
    @Autowired
    public ProfessionDao(HeroStorage heroStorage){
        storage = heroStorage;
    }

    void saveProfession(Profession profession){
        storage.professions.add(profession);
    }
    void deleteProfession(Profession profession){
        storage.professions.remove(profession);
    }
    List<Profession> findAllProfessions(){
        return storage.professions;
    }
    Profession findByName(String name){
        return storage.professions.get(0);
    }

}
