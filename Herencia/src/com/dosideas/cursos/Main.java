package com.dosideas.cursos;

public class Main {
    public static void main(String[] args) {
        Pantalon pantalon = new Pantalon("pepe",500,"levis",42,"jean");
        Remera remera = new Remera("Long Beach", 2000, "Rusty", 45,"Rojo");
        Zapatilla zapatilla = new Zapatilla("Runner",7800, "Adidas",44,11,"Runner");
        //sout + tab
        System.out.println(pantalon.toString());
        System.out.println(remera.toString());
        System.out.println(zapatilla.toString());
    }
}
