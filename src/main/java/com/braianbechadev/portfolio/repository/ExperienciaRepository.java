/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.braianbechadev.portfolio.repository;
import com.braianbechadev.portfolio.model.Experiencialab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ExperienciaRepository extends JpaRepository <Experiencialab, Long> {
    
}
    

