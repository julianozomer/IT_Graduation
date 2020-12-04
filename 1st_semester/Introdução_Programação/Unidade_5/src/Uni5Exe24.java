import java.util.Scanner; /////********** */

public class Uni5Exe24 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double LimitePesoDiárioKG;
        double pesoG;
        double totalPesca = 0;
        char resposta = 's';

        System.out.print("Digite o limite diário em KG: ");
        LimitePesoDiárioKG = teclado.nextDouble();

        while ((totalPesca <= LimitePesoDiárioKG) && (resposta == 's')) {
            System.out.println("Qual o peso do peixe em G?");
            pesoG = teclado.nextDouble();
            totalPesca += pesoG / 1000;
            System.out.print("Deseja informar o peso de mais um peixe? [s/n]: ");
            resposta = teclado.next().charAt(0);
        }
        if (resposta == 'n') {
            System.out.println("ENCERRADO");
        } else {
            System.out.println(
                    "Limite Excedido. Peso total: " + totalPesca + " KG. Peso permitido: " + LimitePesoDiárioKG);
        }
        teclado.close();
    }

}