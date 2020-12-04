import java.util.Scanner;

public class Uni4Exe24 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    int valor3 = teclado.nextInt();
    int opcao = teclado.nextInt();
    int valorMenor = 0, valorMedio = 0, valorMaior = 0;

    if ((valor1 < valor2) && (valor1 < valor3)) {
      valorMenor = valor1;
      if (valor2 < valor3) {
        valorMedio = valor2;
        valorMaior = valor3;
      } else {
        valorMedio = valor3;
        valorMaior = valor2;
      }
    } else {
      if ((valor2 < valor1) && (valor2 < valor3)) {
        valorMenor = valor2;
        if (valor1 < valor3) {
          valorMedio = valor1;
          valorMaior = valor3;
        } else {
          valorMedio = valor3;
          valorMaior = valor1;
        }
      } else {
        valorMenor = valor3;
        if (valor1 < valor2) {
          valorMedio = valor1;
          valorMaior = valor2;
        } else {
          valorMedio = valor2;
          valorMaior = valor1;
        }
      }
    }

    switch (opcao) {
      case 1: // ordem crescente
        System.out.println(valorMenor + "," + valorMedio + "," + valorMaior);
        break;
      case 2: // ordem decrescente
        System.out.println(valorMaior + "," + valorMedio + "," + valorMenor);
        break;
      case 3: // maior valor fique no meio
        System.out.println(valorMenor + "," + valorMaior + "," + valorMedio);
        break;
      default:
        System.out.println("Opção ERRADA ...");
        break;
    }
    teclado.close();
  }
}