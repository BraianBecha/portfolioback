/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.Controller;

import com.braianbechadev.portfolio.model.Educacion;
import com.braianbechadev.portfolio.model.Experiencialab;
import com.braianbechadev.portfolio.model.Persona;
import com.braianbechadev.portfolio.model.Proyecto;
import com.braianbechadev.portfolio.service.IEducacionService;
import com.braianbechadev.portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.braianbechadev.portfolio.service.IPersonaService;
import com.braianbechadev.portfolio.service.IProyectoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController  /*con esta anotation indicamos que esta es nuestra clase controladora que recibe las peticiones del cliente y las redirecciona cual pivot */
@CrossOrigin(origins="*")


public class Controller {
    
    
    
    @Autowired
    /*vamos a implementar la interface*/ 
    private IPersonaService persoServ;
    
    
    
    
    
    @PostMapping(value = "/new/persona")  
    public void agregarPersona (@RequestBody Persona per){ //en la request va la persona en un .json
      // listaPersonas.add(pers);
       persoServ.crearPersona(per); 
       
    }/* request body significa que lla persona va en el cuerpo de la solicitud a traves de un .json*/
   
    
    @GetMapping ("/ver/personas")
    @ResponseBody //esta anotation le dice que lo que se devuelva en esta función sea en el cuerpo de la respuesta
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("/editar/persona")    
        public void eidtarPersona(@RequestBody Persona pers){
            persoServ.editarPersona(pers);
            
        
        }
    
  
       //////////////////////////////////////////////////////////
        
        
        @GetMapping ("/buscar/persona/{id}")
    @ResponseBody //esta anotation le dice que lo que se devuelva en esta función sea en el cuerpo de la respuesta
    public Persona buscarPersona(@PathVariable long id){
        return persoServ.buscarPersona(id);
    }
        
     
        
        /////////////////////////////////////////////////////
        
        
       
     
        





}        
        
        
        

