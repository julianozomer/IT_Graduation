import java.util.Scanner;
public class Uni4Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Horas Trabalhadas: ");
        int horas = teclado.nextInt();
        System.out.println("Valor por hora: ");
        double valor = teclado.nextDouble();


        if (horas > 40) {
            double salario = (valor * 0.5 + valor) * horas;
            System.out.println("Salário Total: " + salario);
        }
        if (horas <= 40) {    
            double salario = valor * horas;
            System.out.println("Salário Total: " + salario);
        }
            teclado.close();
        }
    }
