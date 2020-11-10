package com.quiz3interfaces.domain;

public class Tesis extends Recurso{
    public Tesis(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public String toString() {
        return "Tesis{" +
                "nombre=" + this.getNombre() +
                '}';
    }
}
