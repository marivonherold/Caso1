/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Caso_de_Uso_1.Cinelitas.service;
import Caso_de_Uso_1.Cinelitas.entity.Pelis;
import java.util.List;

/**
 *
 * @author Manne
 */
public interface IPelisService {
     public List<Pelis> getAllPeli();

    public Pelis getPeliculaById(long id);

    public void delete(long id);

    public void savePelicula(Pelis pelicula);
}
