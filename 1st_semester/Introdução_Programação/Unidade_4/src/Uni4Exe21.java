import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        System.out.println("Digite a massa em kg: ");
        double massa = teclado.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = teclado.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("IMC = " + df_1.format(imc) + "\n" + "Magreza");
        } else {
            if (imc >= 18.5 && imc < 25) {
                System.out.println("IMC = " + df_1.format(imc) + "\n" + "Saudável");
            } else {
                if (imc >= 25 && imc < 30) {
                    System.out.println("IMC = " + df_1.format(imc) + "\n" + "Sobrepeso");
                } else {
                    if (imc >= 30 && imc < 35) {
                        System.out.println("IMC = " + df_1.format(imc) + "\n" + "Obesidade Grau I");
                    } else {
                        if (imc >= 35 && imc < 40) {
                            System.out.println("IMC = " + df_1.format(imc) + "\n" + "Obesidade Grau II (severa)");
                        } else {
                            System.out.println("IMC = " + df_1.format(imc) + "\n" + "Obesidade Grau III (morbida)");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
