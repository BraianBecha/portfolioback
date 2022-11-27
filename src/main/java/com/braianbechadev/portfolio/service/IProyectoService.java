/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Proyecto;
import java.util.List;




public interface IProyectoService {
    
    public List<Proyecto> verProyectos();
    public void crearProyecto(Proyecto proy);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto (Long id);
    public void editarProyecto(Proyecto edu);

}