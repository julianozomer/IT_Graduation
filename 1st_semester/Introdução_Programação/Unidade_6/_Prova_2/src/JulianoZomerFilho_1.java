import java.util.Scanner;
import java.text.DecimalFormat;

public class JulianoZomerFilho_1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        int opcaoTeclado;
        int qtdDiarias;
        String nomeHospede;
        double valorDiaria = 50;
        double valorDiariaTotal = 0;
        int totalContasEncerradas = 0;
        
        do {
            System.out.println("_________ Controle de Hóspedes _________");
            System.out.println("1. encerrar a conta de um hóspede");
            System.out.println("2. verificar número de contas encerradas");
            System.out.println("3. sair");
            System.out.print("__opção: ");
            opcaoTeclado = teclado.nextInt();

            switch (opcaoTeclado) {
                case 1:
                System.out.println("_Hóspede_");
                System.out.print("nome: ");
                nomeHospede = teclado.next();
                System.out.print("diárias: ");
                qtdDiarias = teclado.nextInt();
                System.out.println("---------------");
                if (qtdDiarias < 15 && qtdDiarias > 0) {
                    valorDiariaTotal = (valorDiaria * qtdDiarias) + 7.5;
                } else {
                    if (qtdDiarias == 15) {
                        valorDiariaTotal = (valorDiaria * qtdDiarias) + 6.5;
                    } else {
                        valorDiariaTotal = (valorDiaria * qtdDiarias) + 5;
                    }
                }
                totalContasEncerradas++;
                System.out.println("Nome: " + nomeHospede);
                System.out.println("Total: " + df_1.format(valorDiariaTotal));
                break;
                case 2:
                System.out.println("_Número de contas encerradas: " + totalContasEncerradas);
                break;
                case 3:
                break;
                default:
                System.out.println("opção errada!");
            }
        } while (opcaoTeclado != 3);
        teclado.close();
    }
}
