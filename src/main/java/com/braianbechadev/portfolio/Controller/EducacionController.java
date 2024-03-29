/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.Controller;

import com.braianbechadev.portfolio.model.Educacion;
import com.braianbechadev.portfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author braia
 */
@RestController
@CrossOrigin(origins="*")
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    
        @PostMapping(value = "/new/educacion")          
    public void agregarEducacion (@RequestBody Educacion edu){
       eduServ.crearEducacion(edu); 
       
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody //esta anotation le dice que lo que se devuelva en esta función sea en el cuerpo de la respuesta
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    
    @DeleteMapping("/delete/{idEdu}")
    public void borrarEducacion(@PathVariable long idEdu){
        eduServ.borrarEducacion(idEdu);
    }
    
    @PutMapping ("/editar/educacion")    
        public void eidtarEducacion(@RequestBody Educacion edu){
            eduServ.editarEducacion(edu);
            
        
        }
    
}
