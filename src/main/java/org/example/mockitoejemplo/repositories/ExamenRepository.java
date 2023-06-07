package org.example.mockitoejemplo.repositories;

import org.example.mockitoejemplo.models.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();
}
