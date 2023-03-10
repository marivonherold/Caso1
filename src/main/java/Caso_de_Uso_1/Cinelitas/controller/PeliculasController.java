/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_de_Uso_1.Cinelitas.controller;

import Caso_de_Uso_1.Cinelitas.entity.Pelis;
import Caso_de_Uso_1.Cinelitas.entity.Salas;
import Caso_de_Uso_1.Cinelitas.service.IPelisService;
import Caso_de_Uso_1.Cinelitas.service.ISalasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Manne
 */
@Controller
public class PeliculasController {

    @Autowired
    private ISalasService salasService;

    @Autowired
    private IPelisService pelisService;

    @GetMapping("/pelis")
    public String index(Model model) {
        List<Pelis> listaPelicula = pelisService.getAllPeli();
        model.addAttribute("titulo", "Lista de Películas");
        model.addAttribute("pelis", listaPelicula);
        return "pelis";

    }

    @GetMapping("/delete/(idP)")
    public String eliminarPelicula(@PathVariable("idP") Long idPelicula) {
        pelisService.delete(idPelicula);
        return "redirect:/pelis";

    }

    @GetMapping("/pelisN")
    public String crearPelicula(Model model) {
        List<Salas> listaSala = salasService.listSalas();
        model.addAttribute("pelis", new Pelis());
        model.addAttribute("salas", listaSala);
        return "agregar";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelis pelis) {
        pelisService.savePelicula(pelis);
        return "redirect:/pelis";
    }

    @GetMapping("/editPelicula/(idP)")
    public String editPelicula(@PathVariable("idP") Long idPelicula, Model model) {
        Pelis pelicula = pelisService.getPeliculaById(idPelicula);
        List<Salas> listaSala = salasService.listSalas();
        model.addAttribute("pelis", pelicula);
        model.addAttribute("salas", listaSala);
        return "agregar";

    }
}
