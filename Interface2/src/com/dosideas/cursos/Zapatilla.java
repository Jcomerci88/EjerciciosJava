package com.dosideas.cursos;

public class Zapatilla extends Producto {
    private int talleEuropa;
    private int talleEstadosUnidos;
    private String modelo;

    public int getTalleEuropa() {
        return talleEuropa;
    }

    public void setTalleEuropa(int talleEuropa) {
        this.talleEuropa = talleEuropa;
    }

    public int getTalleEstadosUnidos() {
        return talleEstadosUnidos;
    }

    public void setTalleEstadosUnidos(int talleEstadosUnidos) {
        this.talleEstadosUnidos = talleEstadosUnidos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Zapatilla " + marca + " " + '"' + nombre + '"' + " talle " + talleEstadosUnidos + " (US) / "
                + talleEuropa + "  (Eur) "+ ", a $" + precio;

    }

    public Zapatilla(String nombre, int precio, String marca, int talleEuropa, int talleEstadosUnidos, String modelo) {
        super(nombre, precio, marca);
        this.talleEuropa = talleEuropa;
        this.talleEstadosUnidos = talleEstadosUnidos;
        this.modelo = modelo;
    }
}
