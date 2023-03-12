/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Educacion;
import java.util.List;




public interface IEducacionService {    

    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long idEdu);
    public Educacion buscarEducacion(Long idEdu);
    public void editarEducacion(Educacion edu);

}