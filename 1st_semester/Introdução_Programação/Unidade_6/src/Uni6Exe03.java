import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {

        double[] vetor = new double[12];
        Scanner teclado = new Scanner(System.in);

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite o valor: ");
            vetor[contador] = teclado.nextDouble();
        }
        for (int contador = 0; contador < vetor.length; contador++) {
            if (contador % 2 == 0) {
                vetor[contador] += vetor[contador] * 0.02;
                System.out.println("Posição: " + contador + " - " + vetor[contador]);
            } else {
                vetor[contador] += vetor[contador] * 0.05;
                System.out.println("Posição: " + contador + " - " + vetor[contador]);

            }
        }
        teclado.close();

    }
}