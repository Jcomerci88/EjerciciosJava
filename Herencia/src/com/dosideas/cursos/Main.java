package com.dosideas.cursos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Pantalon pantalon = new Pantalon("pepe",500,"levis",42,"jean");
        Remera remera = new Remera("Long Beach", 2000, "Rusty", 45,"Rojo");
        Zapatilla zapatilla = new Zapatilla("Runner",7800, "Adidas",44,11,"Runner");
        //sout + tab
        System.out.println(pantalon.toString());
        System.out.println(remera.toString());
        System.out.println(zapatilla.toString());
        // ejercicio array
        final  int numMax =5 ;
        Producto arrayProducto[] = new Producto[numMax];
        arrayProducto[0] = new Producto("producto1",100,"Adidas");
        arrayProducto[1] = new Producto("producto2",200,"Adidas");
        arrayProducto[2] = new Producto("producto3",300,"Nike");
        arrayProducto[3] = new Producto("producto4",400,"Puma");
        arrayProducto[4] = new Producto("producto5",500,"Reebok");
        System.out.println("____Ejercicio Array    ____________________________________________");
        for (Producto regArray:arrayProducto
        ) {
            System.out.println(regArray);
        }
        System.out.println("____Ejercicio Arraylist____________________________________________");
        // ejercicio arraylist
        //ArrayList <ClaseDelObjeto> NombreArrayList= new ArrayList <ClaseDelObjeto> ();
        ArrayList<Producto> arrayListProd = new ArrayList<Producto>();
        arrayListProd.add(new Producto("producto10",1000,"adidacta"));
        arrayListProd.add(new Producto("producto30",3000,"mike"));
        arrayListProd.add(new Producto("producto20",4000,"ribok"));
        for (Producto regArrayList:arrayListProd
             ) {
            System.out.println(regArrayList);

        }
        System.out.println("____Ejercicio Arraylist for each_____________________________");
        arrayListProd.forEach((regArrayList2)->{
            System.out.println(regArrayList2);
        });
        System.out.println("____Ejercicio Arraylist iterator_____________________________");
        Iterator<Producto> it = arrayListProd.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("____Ejercicio Arraylist streams _____________________________");
        Arrays.stream(arrayProducto).forEach(System.out::println);


    }
}
