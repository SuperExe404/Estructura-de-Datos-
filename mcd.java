import java.util.Scanner;

public class mcd {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el primer numero:");
            int a = scanner.nextInt();

            System.out.println("Ingresa el segundo numero:");
            int b = scanner.nextInt();

            int result = mcd(a,b);

            System.out.println("El Maximo Comun Dvisor de los numeros "+ a +" y "+ b +" es igual a " + result);
        }
    }

    private static int mcd (int a, int b) {
        int ReciduoTemporal;
        while (b != 0) {
            ReciduoTemporal = b;
            b = a % b;
            a = ReciduoTemporal;
        }
        return a;
    }
}