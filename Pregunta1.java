package PracticaCalificada;

public class Pregunta1 {
    public static void main(String[] args) {
        //Con System.out.print() imprimimos un texcto en pantalla, en este caso es la peticion para la vocal
        System.out.print("Escribe un caracter para verificar si es o no una vocal: " + "\n");
        //Aqui declaramos la variable "letra" con el tipo char, este almacena un solo caracter.
        char letra;
        //aqui le decimos al sistema que nos deje darle un valor a la variable "letra", osea lo que leera para definir si es vocal o no. (Tambien se dice simplemente "almacenar", de manera tanto mas formal)
        letra = System.console().readLine().charAt(0);

        //Aqui empieza la magia, pues se reutiliza un par de cosas. Primero: los "||" sirven en lenguaje normal como un "o", osea que solo debe cumplir una de las sentencias y al ser pocas variables se puede usar un if para hacer cinco "o" para determinar si es o no una vocal. Y luego solamente soltamos el resultado.
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.print("Es una vcal.");
        } else {
            System.out.print("Es una consonante o un caracter especial, animal.");
        }
    }
}
