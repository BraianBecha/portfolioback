/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.braianbechadev.portfolio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="persona")
public class Persona implements Serializable {//esto es un mapeo
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String mail;
    private String sobre_mi;
    private String ocupacion;
    private String image_background_header;
    private String imagen_perfil;
    private String ciudad;
                            
    
   
   @OneToMany(mappedBy = "personaedu" , cascade = CascadeType.ALL, orphanRemoval = true)
private List<Educacion> educacion;

@OneToMany(mappedBy = "personaexp" , cascade = CascadeType.ALL, orphanRemoval = true)
private List<Experiencialab> experiencias;
   
  @OneToMany(mappedBy = "personaskill" , cascade = CascadeType.ALL, orphanRemoval = true)
private List<Skill> skillList;

@OneToMany(mappedBy = "persona" ,   cascade = CascadeType.ALL, orphanRemoval = true)
 private List<Proyecto> proyectos;

    
    public Persona(Long id, String nombre, String apellido, String nacionalidad, String mail, String sobre_mi, String ocupacion, String image_background_header, String imagen_perfil, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        this.sobre_mi = sobre_mi;
        this.ocupacion = ocupacion;
        this.image_background_header = image_background_header;
        this.imagen_perfil = imagen_perfil;
        this.ciudad = ciudad;
      //  educacionList =new ArrayList();
       // experiencialabList =new ArrayList();
       // proyectoList =new ArrayList();
        
    }

         
    
    public Persona(){
         
        
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getNacionalidad() {
        return nacionalidad;
    }

   
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    
    public String getMail() {
        return mail;
    }

    
    public void setMail(String mail) {
        this.mail = mail;
    }

    
    public String getSobre_mi() {
        return sobre_mi;
    }

   
    public void setSobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }

    
    public String getOcupacion() {
        return ocupacion;
    }

    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    
    public String getImage_background_header() {
        return image_background_header;
    }

    
    public void setImage_background_header(String image_background_header) {
        this.image_background_header = image_background_header;
    }

    
    public String getImagen_perfil() {
        return imagen_perfil;
    }

    public void setImagen_perfil(String imagen_perfil) {
        this.imagen_perfil = imagen_perfil;
    }

   
    public String getCiudad() {
        return ciudad;
    }

   
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
}
