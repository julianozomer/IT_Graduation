import java.util.Scanner;    ///////*********** */

public class Uni5Exe21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altChico = 1.50;
        double altZé = 1.10;
        int anosParaCrescer = 0;

        while (altZé < altChico) {
            anosParaCrescer+=1;
            altZé+=0.03;
            altChico+=0.02;
            
        }
        System.out.println("Zé levará "+anosParaCrescer+" anos para ser maior que Chico");

        teclado.close();
    }

}