import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        generarNumerosAleatorios();
    }

    public static void generarNumerosAleatorios() {
        Random random = new Random();
        
        System.out.println("20 números aleatorios entre 1 y 10:");
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(10) + 1; // Genera números entre 1 y 10
            System.out.print(numero + " ");
        }
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Validar que los números sean distintos
        while (numero1 == numero2) {
            System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            System.out.print("Introduce el primer número: ");
            numero1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            numero2 = scanner.nextInt();
        }

        // Determinar el menor y el mayor
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        // Mostrar los números comprendidos entre ellos incrementando de 7 en 7
        System.out.println("Números comprendidos entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }
    }
}
