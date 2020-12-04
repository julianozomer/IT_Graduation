import java.util.Scanner;   ////************* */

public class Uni5Exe18 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int canal = 1;
        int numeroPessoasAssistindo4 = 0;
        int somaPessoasAssistindo4 = 0;
        int numeroPessoasAssistindo5 = 0;
        int somaPessoasAssistindo5 = 0;
        int numeroPessoasAssistindo9 = 0;
        int somaPessoasAssistindo9 = 0;
        int numeroPessoasAssistindo12 = 0;
        int somaPessoasAssistindo12 = 0;

        while (canal != 0) {
            System.out.print("Digite o número do canal: ");
            canal = teclado.nextInt();
            switch (canal) {
                case 4:
                    System.out.print("Digite o número de pessoas assistindo o canal 4: ");
                    numeroPessoasAssistindo4 = teclado.nextInt();
                    somaPessoasAssistindo4 += numeroPessoasAssistindo4;
                    break;
                case 5:
                    System.out.print("Digite o número de pessoas assistindo o canal 5: ");
                    numeroPessoasAssistindo5 = teclado.nextInt();
                    somaPessoasAssistindo5 += numeroPessoasAssistindo5;
                    break;
                case 9:
                    System.out.print("Digite o número de pessoas assistindo o canal 9: ");
                    numeroPessoasAssistindo9 = teclado.nextInt();
                    somaPessoasAssistindo9 += numeroPessoasAssistindo9;
                    break;
                case 12:
                    System.out.print("Digite o número de pessoas assistindo o canal 12: ");
                    numeroPessoasAssistindo12 = teclado.nextInt();
                    somaPessoasAssistindo12 += numeroPessoasAssistindo12;
                    break;
                case 0:
                    break;
            }
        }
        System.out.println("Pessoas assistindo canal 4: " + ((somaPessoasAssistindo4 * 100)
                / (somaPessoasAssistindo4 + somaPessoasAssistindo12 + somaPessoasAssistindo5 + somaPessoasAssistindo9))
                + " %");
        System.out.println("Pessoas assistindo canal 5: " + ((somaPessoasAssistindo5 * 100)
                / (somaPessoasAssistindo4 + somaPessoasAssistindo12 + somaPessoasAssistindo5 + somaPessoasAssistindo9))
                + " %");
        System.out.println("Pessoas assistindo canal 9: " + ((somaPessoasAssistindo9 * 100)
                / (somaPessoasAssistindo4 + somaPessoasAssistindo12 + somaPessoasAssistindo5 + somaPessoasAssistindo9))
                + " %");
        System.out.println("Pessoas assistindo canal 12: " + ((somaPessoasAssistindo12 * 100)
                / (somaPessoasAssistindo4 + somaPessoasAssistindo12 + somaPessoasAssistindo5 + somaPessoasAssistindo9))
                + " %");
        teclado.close();
    }
}