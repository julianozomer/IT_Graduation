import java.util.Scanner;

public class Uni6Exe04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        for (int contador = 0; contador < vetor1.length; contador++) {
            System.out.print("Digite o valor de Vetor 1 - Posição: " + contador + ": ");
            vetor1[contador] = teclado.nextInt();
        }
        for (int contador = 0; contador < vetor2.length; contador++) {
            System.out.print("Digite o valor do Vetor 2 - Posição: " + contador + ": ");
            vetor2[contador] = teclado.nextInt();
        }
        for (int contador = 0; contador < 10; contador++) {
            System.out.println(
                    "Soma do Vetor 1 e Vetor 2 - Posição: " + contador + " = " + (vetor1[contador] + vetor2[contador]));

        }
        teclado.close();
    }

}