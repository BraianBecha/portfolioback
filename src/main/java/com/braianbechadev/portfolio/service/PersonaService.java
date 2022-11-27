/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Persona;
import com.braianbechadev.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaService implements IPersonaService {
    
    @Autowired                          /*nos permite hacer inyección de dependencias*/
    public PersonaRepository persoRepo;
/*implementar los metodos jpa que el repositorio nos otorga*/
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
      persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    @Override 
    public void editarPersona(Persona per){
        persoRepo.save(per);
    }
    
    
     
    
}
