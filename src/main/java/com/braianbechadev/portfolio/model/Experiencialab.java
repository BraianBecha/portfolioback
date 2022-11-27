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

/**
 *
 * @author braia
 */
@Getter
@Setter
@Entity
@Table(name="experiencialabList")
public class Experiencialab implements Serializable {
    
    @Column(name = "idExp")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idExp;
    private String titulo;
    private String descripcion;
    private String empresa;    
    private String fechainicio;
    private String fechafin;
    
    
    
    @ManyToOne()
    @JoinColumn(name = "person_id")    
    private Persona personaexp;
    
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public Experiencialab(int idExp,String titulo, String descripcion, String fechainicio, String fechafin,String empresa) {
        this.idExp = idExp;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.empresa = empresa;
    }
     public Experiencialab(){
        
    }
    
     @ManyToOne()
    @JoinColumn(name = "id")
    private Persona perso;

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    
    public int getId() {
        return idExp;
    }

    public void setId(int idExp) {
        this.idExp = idExp;
    }
    
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String Empresa) {
        this.empresa = empresa;
    }
    
}
