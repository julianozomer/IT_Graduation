import java.util.Scanner;
public class Uni4Exe03 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre valor 1: ");
    int valor1 = teclado.nextInt();
    System.out.println("Entre valor 2: ");
    int valor2 = teclado.nextInt();

    if (valor1 > valor2) {
        System.out.println(valor1 + " é maior");
    }

    else {
        System.out.println(valor2 + " é maior");
    }

        teclado.close();
    }
}
