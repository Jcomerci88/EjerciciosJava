package com.dosideas;

public class PersonaAdulta
{
    String nombre;
    String apellido;

    public PersonaAdulta(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public  static void saludar (String nombrePar){
        // porque hay que poner static??
        System.out.println("Hola, "+ nombrePar + ".Mi nombre es " + PersonaAdulta.nombre);
    }
}
