package com.example.personaumg4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personaumg4.model.Pais;
import com.example.personaumg4.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }
}