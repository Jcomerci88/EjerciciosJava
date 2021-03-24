public class Main {
    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hola, mundo");
    }
}

//Duda si hay que poner Main y despues main, porque puse dos veces main y me dio warning
//Hay algo para dejar anotaciones en el proyecto?


/*
¿Qué es el método main()?

El método main() ha de llamarse main, en minúscula. A la hora de ejecutar el código, el entorno de ejecución de Java (JRE)
 busca el punto de entrada predeterminado. El JRE solo sabe que es un método llamado main.
Es el punto de entrada de un programa ejecutable; es donde se inicia y finaliza el control del programa.

Si cambiás el nombre del método main el programa deja de ejecutarse. ¿Por qué?

Si no lo encuentra, no puede acceder. Es por ello que puedes considerar main como una palabra clave de acceso. Si la cambias, tu aplicación no se ejecutará.
Error: Main method not found in class main, please define the main method as:
   public static void main(String[] args)

La firma completa del método es public static void main(String[] args).
¿Qué significa el public? public: Un método público es accesible desde fuera de la clase.
¿Qué significa el static? static: Un método estático es aquel que se puede ejecutar sin una instancia de la clase.
¿Qué significa el void? Que no retorna ningun valor, al ser la primera linea no tiene sentido
¿Qué representa el String[] del parámetro? El método main() de Java necesita un String[] porque el usuario de nuestro programa
puede pasar parámetros extra desde la línea de comando a nuestro programa. Esos parámetros, el programador los recibe a través de ese array.
Cualquier clase que se declara con corchetes “[]”, quiere decir que lo que tienes no es una instancia de esa clase, sino un array de objetos de dicha clase
 */