/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.braianbechadev.portfolio.service;
import com.braianbechadev.portfolio.model.Persona;
import java.util.List;


//acá se declaran métodos que se implementarán en personaservice

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public void editarPersona(Persona per);
    
    
}
