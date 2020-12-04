import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
    public static void main(String[] args) {
        //Leitura
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");
        Double R = teclado.nextDouble();
        Double pi = 3.14159;
        Double A = R * R * pi;
    
        System.out.println("A=" + df_4.format(A));
        teclado.close();


    }
}
