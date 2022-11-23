package com.grupo04.miapirest.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.grupo04.miapirest.modelos.PeliculaModelo;
@Repository
public interface PeliculaRepositorio extends MongoRepository <PeliculaModelo , String>{
    
}
