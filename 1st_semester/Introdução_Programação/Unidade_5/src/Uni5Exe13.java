import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número total de reabastecimentos: ");
        int vezesAbastecidas = teclado.nextInt();
        
        int litrosAbastecidosTotal = 0;
        double kmPorLitroParada = 0;
        double kmMediaLitroTotal = 0;
        double distanciaPercorrida;
        double distanciaPercorridaTotal = 0;
        double litrosReabastecidos;

        for (int i = 1; i <= vezesAbastecidas; i++) {
            System.out.print("Distância percorrida na parada " + i + ": ");
            distanciaPercorrida = teclado.nextDouble();
            System.out.print("Litros consumidos: ");
            litrosReabastecidos = teclado.nextInt();

            distanciaPercorridaTotal += distanciaPercorrida;
            litrosAbastecidosTotal += litrosReabastecidos;

            kmPorLitroParada = distanciaPercorrida / litrosReabastecidos;
            System.out.println("Km por litro na parada " + i + ": " + kmPorLitroParada);
            kmMediaLitroTotal = distanciaPercorridaTotal / litrosAbastecidosTotal;

        }
        
        System.out.println("Km por litro total da viagem: " + kmMediaLitroTotal);

        teclado.close();
    }
}
