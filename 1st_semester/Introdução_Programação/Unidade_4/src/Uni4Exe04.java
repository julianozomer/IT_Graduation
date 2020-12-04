import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = teclado.nextDouble();

        if (valor - Math.floor(valor) != 0.0) {
            System.out.print(valor + " tem casas decimais");
		}
		else {
			System.out.print(valor + " não tem casas decimais");
		}
	teclado.close();
	}
}
