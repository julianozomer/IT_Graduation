import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura = 0;
        double mediaAltura = 0;

        for (int inc = 1; inc <= 20; inc++) {
            System.out.println("Altura pessoa " + inc + ":");
            altura = teclado.nextDouble();
            mediaAltura += altura;
        }
        mediaAltura = mediaAltura / 20;
        System.out.println("Média de altura: " + mediaAltura);
        teclado.close();
    }
}
