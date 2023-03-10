/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_de_Uso_1.Cinelitas.service;
import Caso_de_Uso_1.Cinelitas.entity.Pelis;
import Caso_de_Uso_1.Cinelitas.repository.PelisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manne
 */
@Service
public class PelisService implements IPelisService{
    
    @Autowired
    private PelisRepository pelisRepository;

    @Override
    public List<Pelis> getAllPeli() {
        return (List<Pelis>)pelisRepository.findAll();
    }

    @Override
    public Pelis getPeliculaById(long id) {
        return pelisRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        pelisRepository.deleteById(id);
    }

    @Override
    public void savePelicula(Pelis pelicula) {
        pelisRepository.save(pelicula);
    }
}
