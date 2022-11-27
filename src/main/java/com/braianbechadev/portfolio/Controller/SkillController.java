/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.Controller;

import com.braianbechadev.portfolio.model.Proyecto;
import com.braianbechadev.portfolio.model.Skill;
import com.braianbechadev.portfolio.service.IProyectoService;
import com.braianbechadev.portfolio.service.ISkillService;
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
public class SkillController {
    
         @Autowired
    private ISkillService skillServ;
    
     @PostMapping(value = "/new/skill")  
    public void agregarSkill (@RequestBody Skill skill){ //en la request va la persona en un .json
      // listaPersonas.add(pers);
       skillServ.crearSkill(skill); 
       
    }/* request body significa que lla persona va en el cuerpo de la solicitud a traves de un .json*/
   
    
    @GetMapping ("/ver/skills")
    @ResponseBody //esta anotation le dice que lo que se devuelva en esta función sea en el cuerpo de la respuesta
    public List<Skill> verSkills(){
        return skillServ.verSkills();
    }
    
    
    @DeleteMapping("/delete//skill{id_skill}")
    public void borrarSkill(@PathVariable long id_skill){
        skillServ.borrarSkill(id_skill);
    }
    
    @PutMapping ("/editar/skill")    
        public void eidtarSkill(@RequestBody Skill skill){
            skillServ.editarSkill(skill);
            
        
        }
    
}
