package com.grupo04.miapirest.modelos;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("peliculas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PeliculaModelo {
    @Id 
    private String id;
    private String nombre;
    private List<String> Terror; // todas las de terror

}
