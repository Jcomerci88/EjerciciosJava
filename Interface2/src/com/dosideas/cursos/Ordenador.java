package com.dosideas.cursos;

import java.util.Comparator;

public class Ordenador implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getPrecio() - o2.getPrecio();
    //ejercicio copiado no entiendo como funciona
        //al ser numerico si es negativo ya sabra como ordenar, ahora si es con un texto no se como seria
    }
}
