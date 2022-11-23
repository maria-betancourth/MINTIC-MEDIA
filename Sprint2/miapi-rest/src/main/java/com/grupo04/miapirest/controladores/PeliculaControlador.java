package com.grupo04.miapirest.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo04.miapirest.modelos.PeliculaModelo;
import com.grupo04.miapirest.repositorios.PeliculaRepositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/peliculas")
public class PeliculaControlador {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;

    @GetMapping
    public List<PeliculaModelo> getListPelicula(){
        return peliculaRepositorio.findAll();// listar todas las peliculas
    }
    @PostMapping(value="path")
    public PeliculaModelo savPelicula(@RequestBody PeliculaModelo pelicula) {

        return peliculaRepositorio.save(pelicula); //save para gaurdar y actualizar
    }
    @DeleteMapping("/{id}")
    public void deletePeliculaById(@PathVariable("id") String id) {
        peliculaRepositorio.deleteById(id); // elimina por id
    }
}

