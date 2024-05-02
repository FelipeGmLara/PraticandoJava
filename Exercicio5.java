import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bem vindo, digite qual horário você estuda:\n M(Manhã),T(Tarde) ou N(Noite)");
        String horario = scanner.nextLine();
        if (horario.equals("M")) {
            System.out.println("Bom dia");
        } else if (horario.equals("T")) {
            System.out.println("Boa tarde");
        } else if (horario.equals("N")) {
            System.out.println("Boa noite");
        } else {
            System.out.println("ESCOLHA INVALIDA");

        }
    }
}
