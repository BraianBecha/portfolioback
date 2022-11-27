/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Experiencialab;
import java.util.List;



public interface IExperienciaService {
    public List<Experiencialab> verExperiencia();
    public void crearExperiencia(Experiencialab exp);
    public void borrarExperiencia(Long id);
    public Experiencialab buscarExperiencia (Long id);
    public void editarExperiencia(Experiencialab exp);
    
    
}
