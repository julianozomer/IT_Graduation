import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1005 {
    public static void main(String[] args) {
        //Leitura
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double X = ((A * 3.5) + (B * 7.5)) / 11;
       
        System.out.println("MEDIA = " + df_5.format(X));
        teclado.close();
    }

}
