package com.dosideas.cursos;


    public class Producto implements Comparable<Producto>{
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

        @Override
        public int compareTo(Producto o) {
            //return o1.getPrecio().compareTo(o2.getPrecio());
            //return this.precio.compareTo(o.precio);
            System.out.println("Precio es : " + precio);
            System.out.println("o.Precio es : " + o.precio);
            if (precio < o.precio){

                return -1;
            }
            if (precio > o.precio) {
                return 1;
            }
            return 0;
            //no se como funciona , la comparacion entre precio y o.precio
            /*
            ¿Cuál es la ventaja de hacer que nuestros objetos implementen Comparable para ordenar?

                    Lo que hace es comparar 2 objetos de la misma clase claseC y se devolver -1, 0 o 1 si el objeto que
            llama al método es respectivamente menor, igual o mayor que el objeto especificado en el método por objeto.

                    objecto1.comparteTo(objeto2);

            negativo si      objeto1 < objeto2
            cero si             objeto1 = objeto2
            positivo si        objeto1 > objeto2

            Si un objeto es mayor o menor que otro es lo que tenemos que hacer nosotros.
            */

        }
        /*
        @Override
        public int compareTo(Producto o) {
            return this.precio.compareTo(o.precio);
        }
        */

    }
