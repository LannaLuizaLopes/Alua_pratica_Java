import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String nome;
    int idade;
        boolean isEstudante;

    System.out.print("Digite seu nome: ");
    nome = scanner.nextLine();

    System.out.print("Digite sua idade: ");
    idade = scanner.nextInt();

    System.out.print("Digite sua altura em metros: ");
    double altura = scanner.nextDouble();

    System.out.print("Você é estudante? (sim/não): ");
    String reposta = scanner.next();
    isEstudante = reposta.equalsIgnoreCase("sim");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " de altura ");
        System.out.println("Você é estudante? " + isEstudante);

        scanner.close();

    }
}