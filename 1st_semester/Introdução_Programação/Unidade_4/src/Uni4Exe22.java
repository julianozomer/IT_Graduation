import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Titulação: Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Titulação: Licenciado em Computação");
                break;
            case 3:
                System.out.println("Titulação: Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("ERRO");
        }
        teclado.close();
    }
}
