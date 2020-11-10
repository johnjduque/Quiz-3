package com.quiz3interfaces.domain;

public class Libro extends Recurso implements Prestable {
    public Libro(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre=" + this.getNombre() +
                '}';
    }
}
