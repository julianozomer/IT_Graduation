import java.util.Scanner; //************** */

public class Uni5Exe34 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numDiarias;
        String nomeHospede;
        double valorDiarias;
        int numContasEnc = 0;

        do {
            System.out.println("==================================");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar o número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.println("==================================");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    nomeHospede = teclado.next();
                    System.out.print("Digite o número de diárias do hóspede: ");
                    numDiarias = teclado.nextInt();
                    if (numDiarias < 15) {
                        valorDiarias = 50 + (numDiarias * 7.50);
                    } else {
                        if (numDiarias == 15) {
                            valorDiarias = 50 + (numDiarias * 6.50);
                        } else {
                            valorDiarias = 50 + (numDiarias * 5);
                        }
                    }
                    numContasEnc++;
                    System.out
                            .println("O nome do hóspede é " + nomeHospede + " e o valor a pagar é R$ " + valorDiarias);
                    break;
                case 2:
                    System.out.println("O total de contas encerradas é: " + numContasEnc);
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 3);
        teclado.close();
    }
}