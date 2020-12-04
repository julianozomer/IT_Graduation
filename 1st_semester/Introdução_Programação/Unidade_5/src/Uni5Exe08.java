import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qtd. valores: ");
        int n = teclado.nextInt();

        int valorLido, valorNegativo, valorNegativoMenor = 0, valorPositivo = 0, mediaPositivo = 0, qtdPositivos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Valores: ");
            valorLido = teclado.nextInt();
            if (valorLido < 0) {
                valorNegativo = valorLido;
                if (valorNegativo < valorNegativoMenor) {
                    valorNegativoMenor = valorNegativo;
                }
            }
            if (valorLido > 0) {
                qtdPositivos++;
                valorPositivo += valorLido;
                mediaPositivo = valorPositivo / qtdPositivos;
            }
        }
        System.out.println("Menor valor negativo: " + valorNegativoMenor);
        System.out.println("Média valores positivos: " + mediaPositivo);

        teclado.close();
    }
}
