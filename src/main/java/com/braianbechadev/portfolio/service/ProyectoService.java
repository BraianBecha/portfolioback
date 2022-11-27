/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Proyecto;
import com.braianbechadev.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author braia
 */

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired    
    public ProyectoRepository proyeRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
      proyeRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
       return proyeRepo.findById(id).orElse(null);
    }
    @Override 
    public void editarProyecto(Proyecto proy){
        proyeRepo.save(proy);
    }

    
    
}