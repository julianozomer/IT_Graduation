import java.util.Scanner;

public class JulianoZomerFilho_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as três notas:");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        double notaBaixa = 0;
        double notaMedia = 0;
        double notaAlta = 0;

        double mediaAlunoSimples = 0;
        double mediaAlunoPonderada = 0;

        if (nota1 < nota2 && nota1 < nota3) {
            notaBaixa = nota1 + 0.1;
            if (nota2 < nota3) {
                notaMedia = nota2 + 0.2;
                notaAlta = nota3 + 0.3;
            } else {
                notaMedia = nota3 + 0.2;
                notaAlta = nota2 + 0.3;
            }
        } else {
            if (nota2 < nota1 && nota2 < nota3) {
                notaBaixa = nota2 + 0.1;
                if (nota1 < nota3) {
                    notaMedia = nota1 + 0.2;
                    notaAlta = nota3 + 0.3;
                } else {
                    notaMedia = nota3 + 0.2;
                    notaAlta = nota1 + 0.3;
                }
            } else {
                notaBaixa = nota3 + 0.1;
                if (nota1 < nota2) {
                    notaMedia = nota1 + 0.2;
                    notaAlta = nota2 + 0.3;
                } else {
                    notaMedia = nota2 + 0.2;
                    notaAlta = nota1 + 0.3;
                }
            }
        }

        System.out.println("_Menu:");
        System.out.println("a) média simples");
        System.out.println("b) média ponderada");
        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'a':
                mediaAlunoSimples = (notaBaixa + notaMedia + notaAlta) / 3;
                System.out.println("O valor da média do aluno: " + mediaAlunoSimples);
                break;
            case 'b':
                mediaAlunoPonderada = (notaBaixa * 0.1) + (notaMedia * 0.2) + (notaAlta * 0.7);
                System.out.println("O valor da média do aluno: " + mediaAlunoPonderada);
                break;
            default:
                System.out.println("Valor inválido do Menu");
                break;
        }
        teclado.close();
    }
}
