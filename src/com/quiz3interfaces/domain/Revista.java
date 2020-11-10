package com.quiz3interfaces.domain;

public class Revista extends Recurso implements Prestable {
    public Revista(String nombre, boolean prestado) {
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
        return "Revista{" +
                "nombre=" + this.getNombre() +
                '}';
    }
}
