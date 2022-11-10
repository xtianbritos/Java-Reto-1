import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        String nombreMascota, tipoMascota, nombreCompleto;
        int edadMascota;

        Scanner input = new Scanner(System.in);


        System.out.println("Introduce tu nombre completo: ");
        nombreCompleto = input.nextLine();

        System.out.println("Introduce el nombre de tu mascota: ");
        nombreMascota = input.nextLine();

        System.out.println("Introduce qué tipo de mascota es: ");
        tipoMascota = input.nextLine();

        System.out.println("Introduce la edad de tu mascota: ");
        edadMascota = input.nextInt();


        System.out.println(nombreMascota+" es un(a) "+tipoMascota+", el cual, tiene "+edadMascota+" años de edad y "+nombreCompleto+" es actualmente su dueño(a).");
    }
}
