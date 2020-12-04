import java.util.Scanner; ////////************** */

public class Uni5Exe28 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char resposta = 's';
        int voto = 0;
        int NDN = 0;
        int CPM22 = 0;
        int Skank = 0;
        int JQ = 0;

        while (resposta == 's') {
            System.out.println("=====================");
            System.out.println("Deseja votar em quem?");
            System.out.println("=====================");
            System.out.println("1 - Nenhum de nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Questa");
            System.out.print("VOTO: ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    NDN += 1;
                    break;
                case 2:
                    CPM22 += 1;
                    break;
                case 3:
                    Skank += 1;
                    break;
                case 4:
                    JQ += 1;
            }
            System.out.println("Deseja votar novamente? [s/n]");
            resposta = teclado.next().charAt(0);
        }
        System.out.println("=====================");
        System.out.println("Total de Votos: ");
        System.out.println("=====================");
        System.out.println("Nenhum de Nós: " + NDN + " - " + (NDN * 100) / (NDN + CPM22 + Skank + JQ) + " %");
        System.out.println("CPM22: " + CPM22 + " - " + (CPM22 * 100) / (NDN + CPM22 + Skank + JQ) + " %");
        System.out.println("Skank: " + Skank + " - " + (Skank * 100) / (NDN + CPM22 + Skank + JQ) + " %");
        System.out.println("Jota Quest: " + JQ + " - " + (JQ * 100) / (NDN + CPM22 + Skank + JQ) + " %");
        System.out.println("==========================");
        if ((NDN > CPM22) && (NDN > Skank) && (NDN > JQ)) {
            System.out.println("O vencedor é Nenhum de Nós");
        } else {
            if ((CPM22 > NDN) && (CPM22 > Skank) && (CPM22 > JQ)) {
                System.out.println("O vencedor é CPM22");
            } else {
                if ((Skank > NDN) && (Skank > CPM22) && (Skank > JQ)) {
                    System.out.println("O vencedor é Jota Quest");
                } else {
                    if ((JQ > NDN) && (JQ > CPM22) && (JQ > Skank)) {
                        System.out.println("O vencedor é Jota Quest");
                    } else {
                        System.out.println("Houve algum empate");
                    }
                }
            }
        }
        System.out.println("==========================");
        teclado.close();
    }
}