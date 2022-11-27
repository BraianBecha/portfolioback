/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.Controller;

import com.braianbechadev.portfolio.model.Experiencialab;
import com.braianbechadev.portfolio.service.IExperienciaService;
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


public class ExperienciaController {
    
    
    @Autowired
       private IExperienciaService expeServ;
       
        @PostMapping(value = "/new/experiencia")  
    public void crearExperiencia(@RequestBody Experiencialab exp){ //en la request va la persona en un .json
      // listaPersonas.add(pers);
       expeServ.crearExperiencia(exp); 
       
    }/* request body significa que lla persona va en el cuerpo de la solicitud a traves de un .json*/
   
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody //esta anotation le dice que lo que se devuelva en esta función sea en el cuerpo de la respuesta
    public List<Experiencialab> verExperiencia(){
        return expeServ.verExperiencia();
    }
    
    
    @DeleteMapping("/delete/{idExp}")
    public void borrarExperiencia(@PathVariable long idExp){
        expeServ.borrarExperiencia(idExp);
    }
    
    @PutMapping ("/editar/experiencia")    
        public void eidtarExperiencia(@RequestBody Experiencialab exp){
            expeServ.editarExperiencia(exp);
            
        
        }
    
}
