import com.sun.jdi.IntegerValue;

public class Principal {
    public static void main(String[] args) {
        //Creá dos variables de tipo int. Asignales un valor al crearlas.
        int valor1 = 2;
        int valor2 = 4;
        int valor3 = valor1 + valor2;
        System.out.println("El resultado de int es " + valor3);

        //Creá dos variables de tipo Integer. Asignales un new Integer() con un número en el constructor al crearlos.
        Integer valor4 = new Integer(2);
        Integer valor5 = new Integer(4);
// por poner integer en minuscula, no me lo tomaba y no entendia porque me daba error
        Integer valor6 = valor4 + valor5;
        System.out.println("El resultado de integer es " + valor6);

        // A una variable de tipo int asginale un Integer.
        Integer enteroInteger = new Integer(5);
        int enteroInt = enteroInteger;
        System.out.println("El resultado de int asignado por Integer es " + enteroInt);

        //A una variable de tipo Integer asignale un int.
        Integer enteroInteger2 = new Integer(5);
        int enteroInt2 = 10;
        enteroInteger2 = enteroInt2;

        System.out.println("El resultado de Integer asignado por Int es " + enteroInteger2);

        //Creá dos variables de tipo long. Asignales un valor al crearlas.
        long valor1a = 2;
        long valor2a = 4;
        long valor3a = valor1a + valor2a;
        System.out.println("El resultado de long es " + valor3a);

        //Creá dos variables de tipo Long. Asignales un new Long() con un número en el constructor al crearlos.
        Long valor4a = new Long(2);
        Long valor5a = new Long(4);
        Long valor6a = valor4a + valor5a;
        System.out.println("El resultado de Long  es " + valor6a);

        // A una variable de tipo long  asginale un Integer.
        Long enteroIntegera = new Long(5);
        long enteroInta = enteroIntegera;
        System.out.println("El resultado de int asignado por Integer es " + enteroInta);

        //A una variable de tipo Integer asignale un int.
        Long enteroInteger2a = new Long(5);
        long enteroInt2a = 10;
        enteroInteger2a = enteroInt2a;

        System.out.println("El resultado de Long asignado por long es " + enteroInteger2a);





    }
}
