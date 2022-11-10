import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre, apellidos;
        int edad;
        float estatura;

        System.out.println("Introduce tu nombre: ");

        Scanner input = new Scanner(System.in);

        nombre = input.nextLine();

        System.out.println("Introduce tus apellidos: ");

        apellidos = input.nextLine();

        System.out.println("Introduce tu edad: ");

        edad = input.nextInt();

        System.out.println("Introduce tu altura en metros (Ej: 1,50): ");

        estatura = input.nextFloat();

        System.out.println("Nombre: "+nombre+", Apellidos: "+apellidos+", Edad: "+edad+", Estatura: "+estatura);
    }
}
