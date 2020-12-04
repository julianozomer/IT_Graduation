import java.util.Scanner;

public class Uni5Exe07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qtd. valores: ");
    int n = teclado.nextInt();

    double valorLido, valorMenor, valorMaior;
    System.out.println("Valores: ");
    valorLido = teclado.nextDouble();
    valorMenor = valorLido;
    valorMaior = valorLido;

    for (int i = 1; i < n; i++) {
      System.out.println("Valores: ");
      valorLido = teclado.nextDouble();
      if (valorLido < valorMenor) {
        valorMenor = valorLido;
      }
      if (valorLido > valorMaior) {
        valorMaior = valorLido;
      }
    }

    System.out.println("valor menor: " + valorMenor);
    System.out.println("valor maior: " + valorMaior);

    teclado.close();
  }
}
