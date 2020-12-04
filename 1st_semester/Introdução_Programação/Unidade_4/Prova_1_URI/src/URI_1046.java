import java.util.Scanner;

public class URI_1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horaInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();

        if (horaInicial >= horaFinal) {
            int duracao = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            int duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        teclado.close();
    }
}
