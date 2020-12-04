import java.util.Scanner;

public class Teste {
    public static void main (String[]args) {

        Scanner S = new Scanner (System.in);

        System.out.println ("Digite o comprimento");
        double comprimento = S.nextDouble();
        System.out.println ("Digite a largura");
        double largura = S.nextDouble();
        double area = largura * comprimento;

        System.out.println ("Área = " +area);
        S.close();
    }
}