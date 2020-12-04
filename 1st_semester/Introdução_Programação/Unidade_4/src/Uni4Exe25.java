import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2, resultado = 0;
        int opcao;

        System.out.print("Valor1: ");
        valor1 = teclado.nextInt();
        System.out.print("Valor2: ");
        valor2 = teclado.nextInt();
        System.out.println();
        System.out.println("     Escolha uma opção:");
        System.out.println("1 - Soma de dois números."); 
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números."); 
        System.out.println("4 - Divisão entre dois números");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1: // Soma
                resultado = valor1 + valor2;
                break;
            case 2: // Diferença
                resultado = valor1 - valor2;
                break;
            case 3: // Produto
                resultado = valor1 * valor2;
                break;
            case 4: // Divisão
                if (valor2 == 0) {
                  System.out.println("Divisão por zero: EEEErro");
                }
                else {
                  resultado = valor1 / valor2;
                }
                break;
            default:
                System.out.println("Operador ERRADO ["+opcao+"] ou ainda não implementado!");
                break;
        }
        System.out.println("Resultado: " + resultado);
        teclado.close();
    }
}