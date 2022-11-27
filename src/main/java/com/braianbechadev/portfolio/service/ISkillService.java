/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Skill;
import java.util.List;

/**
 *
 * @author braia
 */
public interface ISkillService {
    
 public void crearSkill(Skill skill);
 
public Skill buscarSkill (Long id);
 
 
public List<Skill> verSkills();

public void borrarSkill(Long id);

public void editarSkill(Skill skill);
    
}
