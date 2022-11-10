import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String nombre;
        String apellidos;

        System.out.println("Introduce tu nombre: ");

        Scanner input = new Scanner(System.in);

        nombre = input.nextLine();

        System.out.println("Introduce tus apellidos: ");

        apellidos = input.nextLine();

        System.out.println("Nombre: "+nombre+", Apellidos: "+apellidos);

    }
}
