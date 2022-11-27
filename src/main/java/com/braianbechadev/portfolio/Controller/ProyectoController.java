/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.Controller;

import com.braianbechadev.portfolio.model.Proyecto;
import com.braianbechadev.portfolio.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyeServ;
    
     @PostMapping(value = "/new/proyecto")  
    public void crearProyecto(@RequestBody Proyecto proy){ //en la request va la persona en un .json
      // listaPersonas.add(pers);   
       proyeServ.crearProyecto(proy); 
       
    }/* request body significa que lla persona va en el cuerpo de la solicitud a traves de un .json*/
   
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody //esta anotation le dice que lo que se devuelva en esta función sea en el cuerpo de la respuesta
    public List<Proyecto> verProyectos(){
        return proyeServ.verProyectos();
    }
    
    
    @DeleteMapping("/delete/{idProy}")
    public void borrarProyecto(@PathVariable long idProy){
        proyeServ.borrarProyecto(idProy);
    }
    
    @PutMapping ("/editar/proyecto")    
        public void eidtarProyecto(@RequestBody Proyecto proy){
            proyeServ.editarProyecto(proy);
            
        
        }
    
}
