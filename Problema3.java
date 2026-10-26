package PracticaCalificada;

public class Problema3 {
    public static void main(String[] args) {

        //primero declaramos las variables a usar
        double edad;
        double boleto = 7;

        //este es el texto donde hacemos la peticion
        System.out.print("El ingreso al cine son 7 soles, por favor, ingrese su edad para aplicarle el descuento correspondiente: " + "\n" + "\n");


        //con esto le dejamos al usuario ingresar datos
        edad = Double.parseDouble(System.console().readLine());

        //Y aqui comienza la magia, simplemente con un if denominamos los intervalos a considerar. No hay mucho que decir mas que el detalle de que
        //si no ponemos "xy.0" el sistema solo te devolcvera "0.0" independientemente de lo que hagas- Ese pequeño cambio de ".0" permito que java te devuelva en decimales correctamente.
        if (edad<=5) {
            boleto = boleto*(60.0/100.0);
            System.out.print("El precio del boleto es: " + boleto);
        } else if (edad>=60) {
            boleto = boleto*(55.0/100.0);
            System.out.print("El precio del boleto es: " + boleto);
        }
    }
}