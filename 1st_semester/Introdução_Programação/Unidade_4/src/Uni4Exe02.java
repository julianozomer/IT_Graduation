import java.util.Scanner;

public class Uni4Exe02 {
  public static void main(String[] args) {
      
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre valor: ");
    int valor = teclado.nextInt();

    if (valor % 2 == 0) {
      System.out.println("é par");
    }
    else {
      System.out.println("é impar'");
    }
    
    teclado.close();
  }
}