/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Educacion;
import com.braianbechadev.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
     
    /**
     *
     */
    @Autowired                          
    public EducacionRepository eduRepo;
    
/*implementar los metodos jpa que el repositorio nos otorga*/
    @Override
    public List<Educacion> verEducacion(){
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu){
      eduRepo.save(edu);
    }

   @Override
    public void borrarEducacion(Long idEdu){
        eduRepo.deleteById(idEdu);
    }
    
    @Override
    public Educacion buscarEducacion(Long idEdu){
       return eduRepo.findById(idEdu).orElse(null);
    }
    
  @Override 
    public void editarEducacion(Educacion edu){
        eduRepo.save(edu);
    }
   
}
