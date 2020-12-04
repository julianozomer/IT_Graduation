import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Lado 1:");
        int lado1 = teclado.nextInt();
        System.out.println("Lado 2:");
        int lado2 = teclado.nextInt();
        System.out.println("Lado 3:");
        int lado3 = teclado.nextInt();
        boolean triangulo = ((lado1 < (lado2 + lado3)) && (lado2 < (lado1 + lado3)) && ((lado3 < (lado2 + lado1))));

        
        if (triangulo) {
            if ((lado1 == lado2) && (lado1 == lado3)) {
                System.out.println("Triângulo Equilátero");
            }
            else {
            if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3))
                System.out.println("Triângulo Escaleno");
             
            else  {                                                       
                System.out.println("Triângulo Isóscele");
            }
        }
        
        } else {
            System.out.print("Não é um triângulo");
                 }
        teclado.close();
    }
}
