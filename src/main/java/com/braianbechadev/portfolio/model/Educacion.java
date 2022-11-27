/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.model;

import java.io.Serializable;
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

@Getter
@Setter
@Entity
@Table(name="educacion")
public class Educacion implements Serializable {
  
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
    private long id; 
    private String escuela;
    private String titulo;
    private String career;  
    private long añoinicio;
    private long añofin;
   
    public Educacion(long id, String escuela, String titulo,  String career,  int añoinicio, int añofin) {
   
        
       
      this.id = id;   
        this.escuela = escuela;
        this.titulo = titulo;        
        this.career = career;
        this.añoinicio = añoinicio;     
        this.añofin = añofin;
        
    }
     public Educacion(){
        
    }
    
    @ManyToOne()
    @JoinColumn(name = "person_id")    
    private Persona personaedu;
    

    public String getEscuela() {
        return escuela;
    }

    public String getTitulo() {
        return titulo;
    }

   

    public String getCareer() {
        return career;
    }

   

    public long getAñoinicio() {
        return añoinicio;
    }

    public long getAñofin() {
        return añofin;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   

    public void setCareer(String career) {
        this.career = career;
    }

   

    public void setAñoinicio(long añoinicio) {
        this.añoinicio = añoinicio;
    }

    public void setAñofin(long añofin) {
        this.añofin = añofin;
    }

   
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
}
