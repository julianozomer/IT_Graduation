import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia:");
        int dia = teclado.nextInt();
        System.out.println("Digite o mês:");
        int mes = teclado.nextInt();
        System.out.println("Digite o ano:");
        int ano = teclado.nextInt();

        int anoBisexto = ano % 4;

        if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12))
                && ((dia >= 1) && (dia <= 31))) {
            System.out.println("Data válida");
        } else {
            if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && ((dia >= 1) && (dia <= 30))) {
                System.out.println("Data válida");
            } else {
                if (((mes == 2) && (anoBisexto != 0)) && ((dia >= 1) && (dia <= 28))) {
                    System.out.println("Data válida");
                } else {
                    if (((mes == 2) && (anoBisexto == 0)) && ((dia >= 1) && (dia <= 29))) {
                        System.out.println("Data válida");
                    } else {
                        System.out.println("Data inválida");
                    }
                }
            }
        }
        teclado.close();
    }
}