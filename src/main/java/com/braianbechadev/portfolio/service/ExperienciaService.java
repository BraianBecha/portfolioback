/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Experiencialab;
import com.braianbechadev.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author braia
 */
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired                          /*nos permite hacer inyección de dependencias*/
    public ExperienciaRepository expeRepo;
/*implementar los metodos jpa que el repositorio nos otorga*/
    @Override
    public List<Experiencialab> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencialab exp) {
      expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencialab buscarExperiencia(Long id) {
       return expeRepo.findById(id).orElse(null);
    }
    @Override 
    public void editarExperiencia(Experiencialab per){
        expeRepo.save(per);
    }
    
}
