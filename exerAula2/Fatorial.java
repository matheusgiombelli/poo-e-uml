import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("Fatorial iterativo: " + fatorialIterativo(numero));
        System.out.println("Fatorial recursivo: " + fatorialRecursivo(numero));
    }

    public static int fatorialIterativo(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * fatorialRecursivo(numero - 1);
    }
}
