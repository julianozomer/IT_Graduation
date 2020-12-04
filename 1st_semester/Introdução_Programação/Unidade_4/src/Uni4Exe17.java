import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a renda anual:");
        double rendaAnual = teclado.nextDouble();
        System.out.println("Digite o número de dependentes:");
        int dependentes = teclado.nextInt();

        double descontoDependentes = dependentes * 0.02;
        double rendaLiquida = rendaAnual - (rendaAnual * descontoDependentes);

        if (rendaLiquida <= 2000) {
            System.out.println("Não paga imposto.");
        } else {
            if (rendaLiquida > 2000 && rendaLiquida < 5000) {
                System.out.println("Paga 5% de imposto.");
            } else {
                if (rendaLiquida >= 5000 && rendaLiquida <= 10000){
                    System.out.println("Paga 10% de imposto.");
                } else {
                    System.out.println("paga 15% de imposto.");
                }
            }
        }
        teclado.close();
    }    
}
