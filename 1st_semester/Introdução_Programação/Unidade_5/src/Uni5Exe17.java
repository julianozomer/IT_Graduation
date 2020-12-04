import java.util.Scanner; ////********* */

public class Uni5Exe17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroInscricao = 1;
        int inscriçãoMaior = 0;
        int inscriçãoMenor = 0;
        double altura = 0;
        double maior = 0;
        double menor = 04;
        double somaAltura = 0;
        double contadorParticipantes = 0;

        while (numeroInscricao != 0) {
            System.out.print("Digite o número de inscrição do atleta: ");
            numeroInscricao = teclado.nextInt();

            if (numeroInscricao != 0) {
                System.out.print("Digite a altura do atleta: ");
                altura = teclado.nextDouble();
                somaAltura += altura;
                contadorParticipantes++;
                if (altura > maior) {
                    maior = altura;
                    inscriçãoMaior = numeroInscricao;
                } else {
                    menor = altura;
                    inscriçãoMenor = numeroInscricao;
                }
            }
            
        }
        System.out.println("Media de altura: " + somaAltura / contadorParticipantes);
        System.out.println("O maior jogador tem a altura de: " + maior + " e sua inscrição é: " + inscriçãoMaior);
        System.out.println("O menor jogador tem: " + menor + " e sua inscrição é: " + inscriçãoMenor);
        teclado.close();
    }
}