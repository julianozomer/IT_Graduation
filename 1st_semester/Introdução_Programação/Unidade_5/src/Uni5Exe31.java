import java.util.Scanner; ////********** */

public class Uni5Exe31 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor;
        int divisor = 2;

        System.out.println("Digite o valor: ");
        valor = teclado.nextInt();

        while (valor != 1) {
            if (valor % divisor == 0) {
                System.out.println(+valor + " | " + divisor);
                valor = valor / divisor;
            } else {
                divisor += 1;
            }
        }
        System.out.println("1");
        teclado.close();
    }
}
