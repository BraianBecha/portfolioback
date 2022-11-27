/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.model;

import java.io.Serializable;
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
@Table(name="proyectos")
public class Proyecto implements Serializable {
    @Id   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String descripcion;
    private String enlacerepo;
    private String enlacefoto;

    

      
    public Proyecto(long id,String titulo, String descripcion, String enlacerepo, String enlacefoto) {
        
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.enlacerepo = enlacerepo;
        this.enlacefoto = enlacefoto;
        
    }
    
    
    
    
 public Proyecto(){
        
    }
        

    @ManyToOne()
    @JoinColumn(name = "persona_id")
    private Persona persona;
    
    
    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public String getEnlacerepo() {
        return enlacerepo;
    }

    
    public void setEnlacerepo(String enlacerepo) {
        this.enlacerepo = enlacerepo;
    }

    public String getenlacefoto() {
        return enlacefoto; 
    }

    
    public void setenlacefoto(String enlacefoto) {
        this.enlacefoto = enlacefoto;
    }

    
    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }
           
  
    
}
