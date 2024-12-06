import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação! Adivinhe o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor!");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
    }
}
