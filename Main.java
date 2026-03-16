void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Idade: ");
    int idade = scanner.nextInt();

    System.out.print("Altura: ");
    double altura = scanner.nextDouble();

    System.out.print("É estudante? (false/true): " );
    boolean ehEstudante = scanner.nextBoolean();

    {
        scanner.nextLine();
    }
    System.out.println("Nome: " + nome);

    System.out.println("Idade: " + idade);

    System.out.println("Altura: " + altura);

    System.out.println("É estudante? " + ehEstudante);

    scanner.close();

}