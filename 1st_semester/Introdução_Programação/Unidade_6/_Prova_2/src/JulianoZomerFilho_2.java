import java.util.Scanner;

public class JulianoZomerFilho_2 {
    static Scanner teclado = new Scanner(System.in);

    static public void vetorLer(int vetor[], String txt) {
        System.out.println(" __ Leitura do " + txt + " __");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(txt + "[" + i + "]: ");
            vetor[i] = teclado.nextInt();
        }
    }

    static public void vetorSoma(int vetor1[], int vetor2[], int vetorSoma[]) {
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
    }

    static public void vetorEscrever(int vetorSoma[]) {
        System.out.println(" __ Resultado da Soma __");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("VetorSoma[" + i + "]: " + vetorSoma[i]);
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // limpa console

        final int vetorTamanho = 5;
        int vetor1[] = new int[vetorTamanho];
        int vetor2[] = new int[vetorTamanho];
        int vetorSoma[] = new int[vetorTamanho];

        vetorLer(vetor1, "Vetor1");
        vetorLer(vetor2, "Vetor2");
        vetorSoma(vetor1, vetor2, vetorSoma);
        vetorEscrever(vetorSoma);

        teclado.close();
    }
}