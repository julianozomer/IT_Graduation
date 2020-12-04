import java.util.Scanner; /////////********** */

public class Uni5Exe25 {

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        char resposta;
        int pontoE = 0;
        int pontoD = 0;

        while (((pontoE<21) && (pontoD<21)) || ((pontoE-pontoD<=1) && (pontoD-pontoE<=1))) {
        System.out.println("Quem marcou ponto: E ou D?: ");
        resposta = teclado.next().charAt(0);
        if (resposta=='e') {
            pontoE+=1;
        } else {
            if (resposta=='d') {
                pontoD+=1;
            }
        }
    }
        System.out.println("Partida encerrada. Pontos esquerdo: "+pontoE+". Pontos direita: " +pontoD);
        teclado.close();
    }
}
