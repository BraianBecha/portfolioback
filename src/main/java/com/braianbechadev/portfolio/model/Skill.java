/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author braia
 */
@Getter
@Setter
@Entity
@Table(name="skillList")
public class Skill{
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;   
    private String nombre;
    private Long ratio;
    private Long tipo; 

    
    
    
   
    
    public Skill() {
    }
    
     
    @ManyToOne()
    @JoinColumn(name = "skills_id")
    private Persona personaskill;
    

    public Skill(Long id, String nombre, long ratio, long tipo) {
        this.id = id;
        this.nombre = nombre;
        this.ratio = ratio;
        this.tipo = tipo;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRatio(long ratio) {
        this.ratio = ratio;
    }

   

    public String getNombre() {
        return nombre;
    }

    public Long getRatio() {
        return ratio;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }
    
    
}
