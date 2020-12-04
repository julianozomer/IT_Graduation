import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o dia do pagamento (1 até 31):");
        int diaPagamento = teclado.nextInt();
        System.out.println("Digite o valor da prestação:");
        double valorPrestacao = teclado.nextDouble();
        int diaVencimento = 10;
        double jurosAtraso = 0.02;
        double totalPagar = 0;

        if (diaPagamento > 0 && diaPagamento <= diaVencimento) {
            totalPagar = valorPrestacao - (valorPrestacao * 0.1);
            System.out.println("Pagamento em dia. (10% de desconto)" + "\n" + "Total a pagar: R$ " + df_2.format(totalPagar));
        } else {
            if (diaPagamento > diaVencimento && diaPagamento <= 15) {
                totalPagar = valorPrestacao;
                System.out.println("Sem desconto." + "\n" + "Total a pagar: R$ " + df_2.format(totalPagar));
            } else {
                if (diaPagamento > 15 && diaPagamento <= 31) {
                    totalPagar = valorPrestacao + (((diaPagamento - 15) * jurosAtraso) * valorPrestacao);
                    System.out.println("Multa de 2% ao dia." + "\n" + "Total a pagar: R$ " + df_2.format(totalPagar));
                } else {
                    System.out.println("ERRO.");
                }
            }
        }
        teclado.close();
    }    
}
