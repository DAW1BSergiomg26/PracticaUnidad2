import java.util.Scanner;

class Factorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado -= i;  // Signo menos - restar
        }

        System.out.println("El factorial de " + numero + " es: " + resultado);
        scanner.close();
    }
}
