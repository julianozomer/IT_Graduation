import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Peso da carta em gramas:");
        int pesoCarta = teclado.nextInt();
        double valorPagar = 0;

        if (pesoCarta <= 50) {
            valorPagar = 0.45;
            System.out.println("Valor do selo: R$ " + valorPagar);
        }
        else {
            int pesoExcedido = pesoCarta - 50;
            int qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + 0.45 * qtAdicional;
            System.out.println("Valor do selo: R$ " + df_2.format(valorPagar));
        }
        teclado.close(); 
    }   
}