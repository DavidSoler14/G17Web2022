/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Modelo.OfertaPracticas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dsole
 */
public interface OfertaPracticasRepository extends JpaRepository<OfertaPracticas,Integer> {
    
}