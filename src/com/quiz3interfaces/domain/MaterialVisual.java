package com.quiz3interfaces.domain;

public class MaterialVisual extends Recurso implements Prestable {
    public MaterialVisual(String nombre, boolean prestado) {
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
        return "MaterialVisual{" +
                "nombre=" + this.getNombre() +
                '}';
    }
}
