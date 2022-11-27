/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Skill;
import com.braianbechadev.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author braia
 */
 
    @Service
public class SkillService implements ISkillService {
    
    @Autowired                         
    public SkillRepository skillRepo;
    @Override
    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
      skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
       return skillRepo.findById(id).orElse(null);
    }
    @Override 
    public void editarSkill(Skill skill){
        skillRepo.save(skill);
    }

   
    
    
     
    
}

