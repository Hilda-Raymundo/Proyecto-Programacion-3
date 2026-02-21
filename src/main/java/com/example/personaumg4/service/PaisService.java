package com.example.personaumg4.service;

import java.util.List;
import com.example.personaumg4.model.Pais;

public interface PaisService {

    List<Pais> findAll();

    Pais save(Pais pais);
}
