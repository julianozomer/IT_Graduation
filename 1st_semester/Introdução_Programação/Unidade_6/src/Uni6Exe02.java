import java.util.Scanner;
public class Uni6Exe02 {
  static Scanner teclado = new Scanner(System.in);

  public static void vetorLer(double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor["+i+"]: ");
      vetor[i] = teclado.nextDouble();
    }
  }

  public static double vetorCalcular(double vetor[],double media) {
    double vetorSoma = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetorSoma += vetor[i];
    }
    media = vetorSoma / vetor.length;
    return media;
  }

  public static void vetorEscrever(double vetor[],double vetorMedia) {
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > vetorMedia) {
        System.out.println("vetor["+i+"]: "+vetor[i]);
      }
    }
  }
  public static void main(String[] args) {
    double vetor[] = new double[12];
    double vetorMedia = 0;

    vetorLer(vetor);
    vetorMedia = vetorCalcular(vetor,vetorMedia);
    vetorEscrever(vetor,vetorMedia);

    teclado.close();
  }
}