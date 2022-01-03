import java.util.Scanner;


//trabalho aprovado
public class PalavraCruzadaMain {
    static private PalavraCruzadaMapa mapa;
    static private PalavraCruzadaPalavras palavras;

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        mapa = new PalavraCruzadaMapa();
        palavras = new PalavraCruzadaPalavras();

        int opcao;

        do {
            System.out.println("_________ Menu: Palavra Cruzada _________");
            System.out.println("1. listar NAO resolvido: palavras");
            System.out.println("2. listar NAO resolvido: mapa");
            System.out.println("3. listar RESOLVIDO: palavras");
            System.out.println("4. sair");
            System.out.print(" __ opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    palavras.palavrasSaidaNaoResolvido();
                    System.out.println("----------------------------");
                    break;
                case 2:
                    mapa.mapaSaidaNaoResolvido();
                    System.out.println("----------------------------");
                    break;
                case 3:
                    palavras.palavrasSaidaResolvido();
                    break;
                case 4:

                    break;
            
                default:
                    System.out.println("opção errada!");
                    System.out.println("----------------------------");
                    break;
            }

        } while (opcao != 4);

        teclado.close();
    }
}
