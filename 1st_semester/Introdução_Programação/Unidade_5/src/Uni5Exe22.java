import java.util.Scanner; ///********** */

public class Uni5Exe22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano = 1995;
        double salario = 2000;
        float percentualReajuste = 0.0075f;

        while (ano != 2020) {
            ano += 1;
            percentualReajuste = percentualReajuste * 2;
            salario = salario + (salario * percentualReajuste);
            System.out.print("Ano: " + ano + " ");
            System.out.printf(" Salário: %.2f", +salario);
            System.out.printf(" Percentual: %.2f", +percentualReajuste);
            System.out.println(" %");
        }
        scan.close();
    }
}