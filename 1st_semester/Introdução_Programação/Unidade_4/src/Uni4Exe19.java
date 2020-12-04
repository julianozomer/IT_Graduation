import java.util.Scanner;


public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a posição X :");
        int x = teclado.nextInt();
        System.out.println("Digite a posição Y :");
        int y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante: 0");
        }else {
            if (x > 0 && y > 0) {
                System.out.println("Quadrante: 1");
            } else{
                if (x > 0 && y < 0) {
                    System.out.println("Quadrante: 2");
                } else {
                    if (x < 0 && y < 0) {
                        System.out.println("Quadrante: 3");
                    } else {
                        if (x < 0 && y > 0) {
                            System.out.println("Quadrante: 4");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}