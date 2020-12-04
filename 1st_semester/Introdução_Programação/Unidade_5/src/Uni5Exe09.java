import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdAluno;
        int idadeAluno;
        int alunoQtdMaior20 = 0;
        String alunoIdade18 = "Aluno c/ 18 anos: \n";
        String nomeAluno;

        System.out.println("Digite a qtd. de alunos:");
        qtdAluno = teclado.nextInt();

        for (int i = 1; i <= qtdAluno; i++) {
            System.out.println("Nome do aluno " + i + ":");
            nomeAluno = teclado.next();
            System.out.println("Idade do aluno " + i + ":");
            idadeAluno = teclado.nextInt();

            if (idadeAluno > 20) {
                alunoQtdMaior20++;
            }

            if (idadeAluno == 18) {
                alunoIdade18 += " - " + nomeAluno + "\n";
            }

        }

        System.out.println("Qtd. Alunos acima de 20 anos: " + alunoQtdMaior20);
        System.out.println(alunoIdade18);

        teclado.close();
    }
}
