package com.dosideas.cursos;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    //!!! porque copie y pegue el proyecto y me queda interface2[herencia]? hay una forma mejor de copiar y pegar proyecto?

    public static void main(String[] args) {
        System.out.println("____Ejercicio Arraylist____________________________________________");
        // ejercicio arraylist
        //ArrayList <ClaseDelObjeto> NombreArrayList= new ArrayList <ClaseDelObjeto> ();
        ArrayList<Producto> arrayListProd = new ArrayList<Producto>();
        arrayListProd.add(new Producto("producto10",1000,"adidacta"));
        arrayListProd.add(new Producto("producto30",4500,"mike"));
        arrayListProd.add(new Producto("producto20",4000,"ribok1"));
        arrayListProd.add(new Producto("producto50",8000,"ribok2"));
        arrayListProd.add(new Producto("producto70",7500,"ribok3"));
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
        System.out.println("____Procesa ordenamiento comparable__________________________");
        Collections.sort(arrayListProd);
        arrayListProd.forEach((regArrayList2)->{
            System.out.println(regArrayList2);
        });
        System.out.println("____Procesa ordenamiento comparator__________________________");
        Collections.sort(arrayListProd, new Ordenador());
        arrayListProd.forEach((regArrayList3)->{
            System.out.println(regArrayList3);
        });



    }
}
