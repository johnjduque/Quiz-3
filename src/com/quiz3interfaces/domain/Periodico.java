package com.quiz3interfaces.domain;

public class Periodico extends Recurso {
    public Periodico(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "nombre=" + this.getNombre() +
                '}';
    }
}
