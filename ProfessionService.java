package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionService {
    ProfessionDao repository;
    @Autowired
    public ProfessionService(ProfessionDao repository){
        this.repository = repository;
    }

    void saveProfession(Profession profession) {
        repository.saveProfession(profession);
    }
    void deleteCharacter(Profession profession){
        repository.deleteProfession(profession);
    }

    List<Profession> findAllProfessions(){
        return  repository.findAllProfessions();
    }
    Profession findByName(String name){
        return  repository.findByName(name);
    }
}
