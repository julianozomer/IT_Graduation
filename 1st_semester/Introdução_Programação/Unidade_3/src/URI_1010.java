import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1010 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int peçaCod_1 = teclado.nextInt();
        int peçaQtd_1 = teclado.nextInt();
        double peçaValor_1 = teclado.nextDouble();
        int peçaCod_2 = teclado.nextInt();
        int peçaQtd_2 = teclado.nextInt();
        double peçaValor_2 = teclado.nextDouble();

        double total = (peçaQtd_1 * peçaValor_1) + (peçaQtd_2 * peçaValor_2);

        System.out.println("VALOR A PAGAR: R$ " + df_2.format(total));

    }

}