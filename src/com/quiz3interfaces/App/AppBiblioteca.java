package com.quiz3interfaces.App;

import com.quiz3interfaces.domain.*;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Recurso libro1 = new Libro("Lógica de programación y algoritmos", false);
        Recurso libro2 = new Libro("Introducción a la programación con Java", true);
        Recurso revista1 = new Revista("RISI", false);
        Recurso revista2 = new Revista("Sistemas y Tecnología", true);
        Recurso matVisual1 = new MaterialVisual("Curso programando con Java", false);
        Recurso matVisual2 = new MaterialVisual("Curso programando con C#", true);
        Recurso tesis1 = new Tesis("Análisis y desarrollo de un video juego para a inducción en estudiantes nuevos", false);
        Recurso tesis2 = new Tesis("Implementación de un sistema de información basado en un enfoque por procesos", true);
        Recurso periodico1 = new Periodico("El Colombiano", false);
        Recurso periodico2 = new Periodico("El Espectador", true);

        biblioteca.AdiccionarRecurso(libro1);
        biblioteca.AdiccionarRecurso(libro2);
        biblioteca.AdiccionarRecurso(revista1);
        biblioteca.AdiccionarRecurso(revista2);
        biblioteca.AdiccionarRecurso(matVisual1);
        biblioteca.AdiccionarRecurso(matVisual2);
        biblioteca.AdiccionarRecurso(tesis1);
        biblioteca.AdiccionarRecurso(tesis2);
        biblioteca.AdiccionarRecurso(periodico1);
        biblioteca.AdiccionarRecurso(periodico2);

        prestandoRecurso(biblioteca, tesis1);
        prestandoRecurso(biblioteca, periodico1);
        devolviendoRecurso(biblioteca, tesis2);
        devolviendoRecurso(biblioteca, libro2);
        prestandoRecurso(biblioteca, libro2);
        prestandoRecurso(biblioteca, libro2);
        prestandoRecurso(biblioteca, libro1);
        prestandoRecurso(biblioteca, matVisual1);
        devolviendoRecurso(biblioteca, libro1);

        System.out.println("Recursos prestados actualmente:" + biblioteca.listarPrestados());

        devolviendoRecurso(biblioteca, libro1);

    }
    public static void prestandoRecurso (Biblioteca biblioteca, Recurso recurso) {
        boolean  prestado = biblioteca.prestarRecurso(recurso);

        if (prestado) {
            if (recurso.isPrestado() == true){
                System.out.println(recurso.toString() + "- El recurso es prestable y se ha prestado correctamente");
            }
        }
        else if (!prestado && recurso instanceof Prestable){
            System.out.println(recurso.toString() + "- El recurso es prestable y se encuentra prestado");
        }
        else {
            System.out.println(recurso.toString() + "- El recurso no es prestable, por la tanto no puede salir de la biblioteca");
        }
    }

    public static void devolviendoRecurso (Biblioteca biblioteca, Recurso recurso) {
        boolean  devolver = biblioteca.devolverRecurso(recurso);

        if (devolver) {
            if (recurso.isPrestado() == false){
                System.out.println(recurso.toString() + "- El recurso es prestable y se ha devuelto correctamente");
            }
        }
        else if (!devolver && recurso instanceof Prestable){
            System.out.println(recurso.toString() + "- El recurso es prestable y se no se encuentra prestado");
        }
        else {
            System.out.println(recurso.toString() + "- El recurso no es prestable, por lo tanto no puede ser devuelto");
        }
    }
}
