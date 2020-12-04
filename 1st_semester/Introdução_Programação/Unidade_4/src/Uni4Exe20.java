import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Nota prova 1 :");
        double nota1 = teclado.nextDouble();
        System.out.println("Nota prova 2 :");
        double nota2 = teclado.nextDouble();
        System.out.println("Nota prova 3 :");
        double nota3 = teclado.nextDouble();
        System.out.println("Média dos exercícios :");
        double nota4 = teclado.nextDouble();
        char conceito;

        double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + nota4) / 7;

        if (mediaAproveitamento >= 9) {
            conceito = 'A';
            System.out.println("Média de aproveitamento: " + df_2.format(mediaAproveitamento) + "\n" + "Conceito: "
                    + conceito + "\n" + "APROVADO");
        } else {
            if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
                conceito = 'B';
                System.out.println("Média de aproveitamento: " + df_2.format(mediaAproveitamento) + "\n" + "Conceito: "
                        + conceito + "\n" + "APROVADO");
            } else {
                if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
                    conceito = 'C';
                    System.out.println("Média de aproveitamento: " + df_2.format(mediaAproveitamento) + "\n"
                            + "Conceito: " + conceito + "\n" + "APROVADO");
                } else {
                    if (mediaAproveitamento >= 4 && mediaAproveitamento < 6) {
                        conceito = 'D';
                        System.out.println("Média de aproveitamento: " + df_2.format(mediaAproveitamento) + "\n"
                                + "Conceito: " + conceito + "\n" + "REPROVADO");
                    } else {
                        conceito = 'E';
                        System.out.println("Média de aproveitamento: " + df_2.format(mediaAproveitamento) + "\n"
                                + "Conceito: " + conceito + "\n" + "REPROVADO");
                    }
                }
            }
        }
        teclado.close();
    }
}
