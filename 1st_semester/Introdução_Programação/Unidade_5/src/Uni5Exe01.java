import java.util.Scanner;
public class Uni5Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor = 0;
    for(int inc = 1; inc <= 20;inc++) {
      System.out.println("Entre valor["+inc+"] : ");
      valor = teclado.nextInt();
      if (valor % 2 == 0) {
        System.out.println("é par");
      }
      else {
        System.out.println("é impar'");
      }
    }
    teclado.close();  
  }
}