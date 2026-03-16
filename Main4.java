void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

      System.out.print("A temperatura em celsius é: ");
      int celsius = scanner.nextInt();

double fahrennheit = ( celsius * 9 / 5.0) + 32;

     System.out.print("A temperatura em fahrenheit é: " + fahrennheit);

     scanner.close();
 }

