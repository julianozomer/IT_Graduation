import java.util.Scanner;
public class Uni4Exe27 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int chegadaHH = teclado.nextInt();
    int chegadaMM = teclado.nextInt();
    int partidaHH = teclado.nextInt();
    int partidaMM = teclado.nextInt();

    if ((chegadaHH > 0) && (chegadaHH <= 24) && (chegadaMM > 0) && (chegadaMM <= 60) && (partidaHH > 0)
        && (partidaHH <= 24) && (partidaMM > 0) && (partidaMM <= 60)) {
      if (chegadaMM >= 30) {
        chegadaHH += 1;
      }
      if (partidaMM >= 30) {
        partidaHH += 1;
      }

      int qtdhoras = 0;
      if (partidaHH >= chegadaHH) {
        qtdhoras = partidaHH - chegadaHH;
      } else {
        qtdhoras = (24 - chegadaHH) + partidaHH;
      }

      double precoCobrado = 0;
      switch (qtdhoras) {
        case 1: // 5,00
            precoCobrado = 5;
          break;
        case 2: // 5,00 + 5,00 = 10,00
            precoCobrado = 10;
        break;
        case 3: // 5,00 + 5,00 + 7,50 = 17,50
            precoCobrado = 17.5;
        break;
        case 4: // 5,00 + 5,00 + 7,50 + 7,50 = 25,00
            precoCobrado = 25;
        break;
        default: // acima 4 horas
            precoCobrado = 25 + (10 * (qtdhoras - 4));
          break;
      }
      System.out.println("Valor cobrado é: "+precoCobrado);
    } else {
      System.out.println("Entrada ERRADA");
    }
    teclado.close();
  }
}