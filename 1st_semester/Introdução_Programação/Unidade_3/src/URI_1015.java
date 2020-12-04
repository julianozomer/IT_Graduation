import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1015 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double x1 = teclado.nextDouble(), y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble(), y2 = teclado.nextDouble();

        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

       
        System.out.println(df_4.format(distancia));
        teclado.close();
    }

}