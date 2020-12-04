import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = teclado.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        }
        else{
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

        teclado.close();
    }
    
}
