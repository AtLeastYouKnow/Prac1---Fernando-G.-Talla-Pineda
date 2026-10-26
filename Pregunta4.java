package PracticaCalificada;

public class Pregunta4 {
    public static void main(String[] args) {

        //Peticion al usuario
        System.out.print("Por favor, introduzca cinco numeros para determinar el menor: " + "\n" + "\n");

        // aqui le permitimos al usuario ingresar los datos solicitados.
        int num1 = Integer.parseInt(System.console().readLine());
        int num2 = Integer.parseInt(System.console().readLine());
        int num3 = Integer.parseInt(System.console().readLine());
        int num4 = Integer.parseInt(System.console().readLine());
        int num5 = Integer.parseInt(System.console().readLine());


        //Y aqui el problema, precisamente anidar "if" de esta manera no es la mejor opcion, y hay formas mas elegantes de hacer como con bucles o scanner.
        //Pero no me viene  a la cabeza ahora. Solo mencionar que los "&&"" son en lenguaje humano un "y" osea que debe cumplr todas las directrices solicitadas o el programa dara error.
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.print("El numero menor es: " + num1);
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.print("El numero menor es: " + num2);
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            System.out.print("El numero menor es: " + num3);
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
            System.out.print("El numero menor es: " + num4);
        } else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
            System.out.print("El numero menor es: " + num5);
        }
    }
}
