import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A cor é azul?");
        boolean valorBoolean = teclado.nextBoolean();

        if (valorBoolean) {
            System.out.println("sim, é azul");
        } else {
            System.out.println("não é azul");
        }
        teclado.close();
    }
}
