import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1009 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        String nome = teclado.next();
        double B = teclado.nextDouble(); // Salario Fixo
        double C = teclado.nextDouble(); //Vendas
        double D = 0.15; // 15% de Comissão sob vendas
        double X = B + (C * D); //Salario Fixo + 15% das vendas
        
        System.out.println("TOTAL = R$ " + df_2.format(X));
        teclado.close();
        
    }   
    
}
