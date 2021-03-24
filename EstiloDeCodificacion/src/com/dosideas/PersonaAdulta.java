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

    public  void saludar (String nombrePar){
        // porque hay que poner static??
        System.out.println("Hola, "+ nombrePar + ". Mi nombre es " + nombre);
    }
}
/*
estaba declarando una static y no usando el objeto para invocar al metodo saludar

¿QUÉ ES UNA VARIABLE STATIC EN JAVA?
Una variable estática (static) en Java es una variable que pertenece a la clase en que fue declarada y se inicializa solo una vez al inicio de la ejecución del programa, la característica principal de este tipo de variables es que se puede acceder directamente con el nombre de la clase sin necesidad de crear un objeto, a continuación otros detalles que tiene una variable static en Java.

Es una variable que pertenece a la clase y no al objeto.
Las variables static se inicializan solo una vez, al inicio de la ejecución. Estas variables se inicializarán primero, antes de la inicialización de cualquier variable de instancia.
¿QUÉ ES UN MÉTODO STATIC EN JAVA?
Un método static en Java es un método que pertenece a la clase y no al objeto. Un método static solo puede acceder a variables o tipos de datos declarados como static.

Un método static sólo puede acceder a datos static. No puede acceder a datos no static (variables de instancia).
Un método static puede llamar solo a otros métodos static y no puede invocar un método no static a partir de él.
Un método static se puede acceder directamente por el nombre de la clase y no se necesita crear un objeto para acceder al método (aunque se puede hacerlo).
Un método static no puede hacer referencia a “this” o “super”.
 */