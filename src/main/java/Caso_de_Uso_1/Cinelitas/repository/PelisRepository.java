/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Caso_de_Uso_1.Cinelitas.repository;
import Caso_de_Uso_1.Cinelitas.entity.Pelis;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Manne
 */

@Repository
public interface PelisRepository extends CrudRepository<Pelis,Long>{
    
}
