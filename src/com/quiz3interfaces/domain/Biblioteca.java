package com.quiz3interfaces.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void AdiccionarRecurso(Recurso recursoAAdiccionar){
        boolean existe = recursos.stream().filter(recurso -> recurso.getNombre().equals(recursoAAdiccionar.getNombre())).findAny().isPresent();

        if (!existe){
            this.recursos.add(recursoAAdiccionar);
        }
    }

    public boolean prestarRecurso (Recurso r){
        if (r instanceof Prestable && r.isPrestado() == false){
            ((Prestable) r).prestar();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean devolverRecurso (Recurso r){
        if (r instanceof Prestable && r.isPrestado() == true){
            ((Prestable) r).devolver();
            return true;
        }
        else{
            return false;
        }
    }

    public List<Recurso> listarPrestados(){
        return this.recursos.stream()
                .filter(recurso -> {
                    return recurso.isPrestado()==true && recurso instanceof Prestable;
                }).collect(Collectors.toList());
    }
}
