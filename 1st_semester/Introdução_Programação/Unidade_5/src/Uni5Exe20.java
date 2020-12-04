import java.util.Scanner; //////********* */

public class Uni5Exe20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double massaMaterial;
        double massaInicial;
        double tempo = 0;
        

        System.out.print("Digite a massa, em KG: ");
        massaMaterial = teclado.nextDouble();
        massaInicial = massaMaterial;
                        
        while (massaMaterial > 0.0005) {
            massaMaterial = massaMaterial/2;
            tempo+=50;
        }
        System.out.println("Massa inicial: "+massaInicial+" KG. Massa Final: " +massaMaterial*1000+  " G. Tempo: "+tempo+" segundos");
    teclado.close();
    }
}
