import java.util.Scanner;
public class Uni4Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Idade Marquinhos: ");
    int idMar = teclado.nextInt();
    System.out.println("Idade Zezinho: ");
    int idZez = teclado.nextInt();
    System.out.println("Idade Luluzinha: ");
    int idLul = teclado.nextInt();


    if ((idMar < idZez) && (idMar < idLul)) {
      System.out.println("Marquinhos é o caçula.");
    }
    else {
      if (idZez < idLul) {
        System.out.println("Zezinho é o caçula.");
      }
      else {
        System.out.println("Luluzinha é o caçula.");
      }
    }
    teclado.close();
  }
}