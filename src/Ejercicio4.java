import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        String pais, ciudad;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el nombre de un país: ");
        pais = input.nextLine();

        System.out.println("Introduce el nombre de su capital: ");
        ciudad = input.nextLine();

        System.out.println("La ciudad "+ciudad+", es la capital del país "+pais);
    }
}
