package com.dosideas.cursos;

public class Pantalon extends Producto {
    private int talle;
    private String material;

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pantalon " + marca + " " + '"' + nombre + '"' + " talle " + talle + ", de " + material + ", a $" + precio;
    }

    public Pantalon(String nombre, int precio, String marca , int talle, String material) {
        super(nombre,precio,marca);
        this.talle = talle;
        this.material = material;
    }


}
