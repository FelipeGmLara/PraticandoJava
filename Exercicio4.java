import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Vamos descobrir qual número é maior!\n");
        System.out.printf("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.printf("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.printf("O PRIMEIRO NÚMERO É MAIOR!");
        } else if (numero2 > numero1) {
            System.out.printf("O SEGUNDO NÚMERO É MAIOR!");
        } else if (numero2 == numero1) {
            System.out.printf("AMBOS SÃO IGUAIS");
        }
    }
}
