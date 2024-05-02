import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vamos somar!\n");
        System.out.printf("Digite o primeiro número para somar: ");
        int numero1 = scanner.nextInt();
        System.out.printf("Digite o segundo número para somar: ");
        int numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.print("O resultado é: " + resultado);
    }
}
