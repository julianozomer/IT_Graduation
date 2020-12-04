import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("'T': calcular a área de um triângulo de base b e altura h");
        System.out.println("'Q': calcular a área de um quadrado de lado l");
        System.out.println("'R': calcular a área de um retângulo de base b e altura h");
        System.out.println("'C': calcular a área de um circulo de raio r");

        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a altura:");
                int altura = teclado.nextInt();
                System.out.println("Digite a base:");
                int base = teclado.nextInt();

                int areaTriangulo = altura * base / 2;
                System.out.println("Área triângulo: " + areaTriangulo);
                break;
            case 'Q':
                System.out.println("Digite um lado:");
                int lado = teclado.nextInt();

                int areaQuadrado = lado * lado;
                System.out.println("Área quadrado: " + areaQuadrado);
                break;
            case 'R':
                System.out.println("Digite a altura:");
                int alturaR = teclado.nextInt();
                System.out.println("Digite a base:");
                int baseR = teclado.nextInt();

                int areaRetangulo = alturaR * baseR;
                System.out.println("Área retângulo: " + areaRetangulo);
                break;
            case 'C':
                System.out.println("Digite o raio:");
                int raio = teclado.nextInt();

                double areaCirculo = 3.14159 * (raio * raio);
                System.out.println("Área círculo: " + areaCirculo);
                break;
            default:
            System.out.println("ERRO");
        }
        teclado.close();
    }
}