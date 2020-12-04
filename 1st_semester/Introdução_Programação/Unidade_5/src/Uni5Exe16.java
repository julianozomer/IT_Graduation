import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double altura = 1;
        double alturaFeminino = 0;
        double alturaMasculino = 0;
        char sexo = ' ';
        int qtdFemino = 0;
        int qtdMasculino = 0;
        
        while (altura != 0) {
            System.out.print("Digite a altura: ");
            altura = teclado.nextDouble();
            if (altura != 0) {
                System.out.print("Digite o sexo: ");
                sexo = teclado.next().charAt(0);
                if (sexo == 'f') {
                    alturaFeminino += altura;
                    qtdFemino++;
                } else {
                    if (sexo == 'm') {
                        alturaMasculino += altura;
                        qtdMasculino++;
                    }
                }
            }
        }
        
        System.out.println("Media da altura das mulheres: " + df_2.format((alturaFeminino / qtdFemino)));
        System.out.println("Media da altura do grupo: " + df_2.format(((alturaFeminino + alturaMasculino) / (qtdFemino + qtdMasculino))));
        teclado.close();
    }
}