import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 3 cartas");
        int carta1 = teclado.nextInt();
        int carta2 = teclado.nextInt();
        int carta3 = teclado.nextInt();
        int qtCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas++;
        }
        if (qtCartasBoas == 1) {
            System.out.println("TRUCO");
        } else {
            if (qtCartasBoas == 2) {
                System.out.println("SEIS");
            } else {
                if (qtCartasBoas == 3) {
                    System.out.println("NOVE");
                }
            }
        }
        teclado.close();
    }
}