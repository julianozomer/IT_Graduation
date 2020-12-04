import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1012 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

       double a = teclado.nextDouble();
       double b = teclado.nextDouble();
       double c = teclado.nextDouble();

       double areaTriangulo = a * c / 2;
       double areaCirculo = 3.14159 * c * c;
       double areaTrapezio = (c * (a + b)) / 2;
       double areaQuadrado = b * b;
       double areaRetangulo = a * b;

        System.out.println("TRIANGULO: " + df_3.format(areaTriangulo) + "\n" + "CIRCULO: " + df_3.format(areaCirculo) + "\n" + "TRAPEZIO: " + df_3.format(areaTrapezio) + "\n" + "QUADRADO: " + df_3.format(areaQuadrado) + "\n" + "RETANGULO: " + df_3.format(areaRetangulo));
        teclado.close();
    }

}