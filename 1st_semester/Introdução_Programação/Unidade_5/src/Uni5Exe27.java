import java.util.Scanner;  //////****************** */

public class Uni5Exe27 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int diaDoMes = 1;
        int resposta = 1;
        double totalPcsManha;
        double totalPcsTarde;

        while (resposta == 1) {
            System.out.println("Digite o dia do mês");
            diaDoMes = teclado.nextInt();
            if ((diaDoMes >= 1) && (diaDoMes <= 15)) {
                System.out.println("Quantas peças o funcionário produziu no turno matutino? ");
                totalPcsManha = teclado.nextDouble();
                System.out.println("Quantas peças o funcionário produziu no turno vespertino? ");
                totalPcsTarde = teclado.nextDouble();
                if (((totalPcsTarde + totalPcsManha) == 100) && (totalPcsManha >= 30) && (totalPcsTarde >= 30)) {
                    System.out.println("Valor recebido: R$ " + (totalPcsManha + totalPcsTarde) * 0.80);
                } else {
                    System.out.println("Valor recebido: R$ " + (totalPcsManha + totalPcsTarde) * 0.50);
                }
                System.out.println("Novo funcionário? (1.sim; 2. não)");
                resposta = teclado.nextInt();
            }
            if ((diaDoMes > 15) && (diaDoMes <= 30)) {
                System.out.println("Quantas peças o funcionário produziu no turno matutino? ");
                totalPcsManha = teclado.nextDouble();
                System.out.println("Quantas peças o funcionário produziu no turno vespertino? ");
                totalPcsTarde = teclado.nextDouble();
                System.out.println("Valor recebido: R$ " + ((totalPcsManha * 0.40) + (totalPcsTarde * 0.30)));
            
            System.out.println("Novo funcionário? (1.sim; 2. não)");
            resposta = teclado.nextInt();
            }

            while ((diaDoMes < 1) || (diaDoMes > 30)) {
                System.out.println("Dia inválido");
                diaDoMes = 1;
            }

        }

        teclado.close();
    }

}