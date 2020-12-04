import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Funcionário admitido há quantos meses:");
        int meses = teclado.nextInt();

        if (meses < 12) {
                System.out.println("Terá 5% de reajuste");
            } else {
            if ((meses >= 13) && (meses <= 48)) {
                System.out.println("Terá 7% de reajuste");
            }
        }


        teclado.close();
    }
}
