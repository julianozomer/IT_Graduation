import java.util.Scanner; ////************* */

public class Uni5Exe19 {

    public static void main(String[] args) {

        double valorCompra = 0.1;
        double somaValorCompra = 0;

        Scanner teclado = new Scanner(System.in);

        while (valorCompra != 0) {
            System.out.print("Digite o valor da compra: R$ ");
            valorCompra = teclado.nextDouble();
            if (valorCompra>500) {
                valorCompra = valorCompra-(valorCompra*0.20);
                somaValorCompra+=valorCompra;
                System.out.printf("Total a pagar: R$ %.2f\n", +valorCompra);
            } else {
                valorCompra = valorCompra-(valorCompra*0.15);
                somaValorCompra+=valorCompra;
                System.out.printf("Total a pagar: R$ %.2f\n", +valorCompra);
            }
            
        }
        System.out.printf("Valor da compra ao fim do dia: R$ %.2f\n", +somaValorCompra);
        teclado.close();
    }
}