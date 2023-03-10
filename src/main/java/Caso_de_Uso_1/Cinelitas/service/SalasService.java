/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_de_Uso_1.Cinelitas.service;

import Caso_de_Uso_1.Cinelitas.entity.Salas;
import Caso_de_Uso_1.Cinelitas.repository.SalasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manne
 */
@Service
public class SalasService implements ISalasService {

    @Autowired
    private SalasRepository salasRepository;

    @Override
    public List<Salas> listSalas() {
        return (List<Salas>) salasRepository.findAll();
    }
}
