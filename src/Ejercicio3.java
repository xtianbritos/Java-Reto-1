import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        String nombre, apellidos, nombreMadre, nombrePadre;

        System.out.println("Introduce tu nombre: ");

        Scanner input = new Scanner(System.in);

        nombre = input.nextLine();

        System.out.println("Introduce tus apellidos: ");

        apellidos = input.nextLine();

        System.out.println("Introduce el nombre de tu padre: ");

        nombrePadre = input.nextLine();

        System.out.println("Introduce el nombre de tu madre: ");

        nombreMadre = input.nextLine();


        System.out.println("Yo "+nombre+" "+apellidos+", soy hijo de "+nombreMadre+" y "+nombrePadre+".");
    }
}
