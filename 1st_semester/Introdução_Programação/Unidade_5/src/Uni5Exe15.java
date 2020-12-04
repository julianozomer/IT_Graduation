import java.util.Scanner;

public class Uni5Exe15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    char alunoNome = ' ';
    double alunoNota1, alunoNota2, alunoMedia = 0;
    System.out.println(" ___ ");

    while (alunoNome != 'f') {
      System.out.println("Nome: ");  alunoNome = teclado.next().charAt(0);;
      if (alunoNome != 'f') {
        System.out.println("Nota1: "); alunoNota1 = teclado.nextDouble();
        System.out.println("Nota2: "); alunoNota2 = teclado.nextDouble();
        alunoMedia = (alunoNota1 + alunoNota2) / 2;
        System.out.println("Média: " + alunoMedia);
      }
    }

    teclado.close();
  }
}