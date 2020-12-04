import java.util.Scanner;


public class Uni5Exe14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double PC = 0;
        double PV = 0;
        double lucro;
        float somaPV = 0;
        float somaPC = 0;
        int qtdMercadoriaMenor10 = 0;
        int qtdMercadoria10a20 = 0;
        int qtdMercaoriaMaior20 = 0;
        double somaLucro = 0;

        for (int cont = 1; cont <= 20; cont++) {
            System.out.print("Preço de compra do produto " + cont + ": ");
            PC = teclado.nextDouble();
            System.out.print("Preço de venda do produto " + cont + ": ");
            PV = teclado.nextDouble();
            lucro = (PV - PC) / (PC * 100);
            somaLucro += lucro;
            somaPC += PC;
            somaPV += PV;
            System.out.println(lucro);

            if (lucro < 10) {
                qtdMercadoriaMenor10 += 1;
            } else {
                if ((lucro >= 10) && (lucro <= 20)) {
                    qtdMercadoria10a20 += 1;
                } else {
                    if (lucro > 20) {
                        qtdMercaoriaMaior20 += 1;
                    }
                }
            }

        }
        System.out.println("Mercadorias com lucro menor que 10%: " +qtdMercadoriaMenor10);
        System.out.println("Mercadorias com lucro entre 10 e 20%: " + qtdMercadoria10a20);
        System.out.println("Mercadorias com lucro acima de 20%: " + qtdMercaoriaMaior20);
        System.out.printf("Total do lucro: %.2f\n", +somaLucro); 
        System.out.printf("Soma do preço de compra: R$ %.2f\n", +somaPC);
        System.out.printf("Soma do preço de venda: R$ %.2f\n", +somaPV);
        teclado.close();
    }
}