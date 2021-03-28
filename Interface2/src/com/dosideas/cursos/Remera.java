package com.dosideas.cursos;

public class Remera extends Producto {
    private int talle;
    private String color;

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Remera " + marca + " " + '"' + nombre + '"' + " talle " + talle + " color " + color + ", a $" + precio;

    }

    public Remera(String nombre, int precio, String marca, int talle, String color) {
        super(nombre, precio, marca);
        this.talle = talle;
        this.color = color;
    }
}
