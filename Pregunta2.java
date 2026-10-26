package PracticaCalificada;

public class Pregunta2 {
    public static void main(String[] args) {

        //En este caso no es necesario declarar ina variable independiente como tal. Para esta pregunta lo mas simple y cotidiano sera usar el "for"
        //Dentro del for declaramos ar de cosas, como: en la primera sentencia le decimos que la variable sera "i" y que iniciara de la posicion 1.
        //Luego le decimos que i no es mayor a 100 pero si es igual al mismo
        //y por ultimo el i++ es una simplificacion de "i = i + 1", osea ira sumandelo de uno en uno hasta llegar al 100.

        //Y por ultimo simplemente imprimimos la variable i.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Funf");
            } else if (i % 3 == 0) {
                System.out.println("Drei");
            } else if (i % 5 == 0) {
                System.out.println("Funk");
            } else {
                System.out.println(i);
            }
        }
    }
}
