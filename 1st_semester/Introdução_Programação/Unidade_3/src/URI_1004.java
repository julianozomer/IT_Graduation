import java.util.Scanner;

public class URI_1004 {
    public static void main(String[] args) {
        //Leitura
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int X = A * B;

        System.out.println("PROD = " +X);
        teclado.close();
    
    }

}