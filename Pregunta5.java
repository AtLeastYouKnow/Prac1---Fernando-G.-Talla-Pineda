package PracticaCalificada;

public class Pregunta5 {
    public static void main(String[] args) {

        int num1, num2;

        System.out.print("Porfas, introduzca dos numeros para ver su divisibilidad; ");
        num1 = Integer.parseInt(System.console().readLine());
        num2 = Integer.parseInt(System.console().readLine());

        if (num1 % num2 == 0) { 
            System.out.print("Si es divisible entre el segundo numero");
         } else {
            System.out.print("No es divisible entre el segundo numero");
         }
    }
}
