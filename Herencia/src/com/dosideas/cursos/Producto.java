package com.dosideas.cursos;

//public abstract class Producto {
    public class Producto {
    protected String nombre;
    protected int precio;
    protected  String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Producto(String nombre, int precio, String marca) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }
}
