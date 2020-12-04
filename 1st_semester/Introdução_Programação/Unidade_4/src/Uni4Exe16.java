import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva a idade do Homem 1:");
        int idadeHomem1 = teclado.nextInt();
        System.out.println("Escreva a idade do Homem 2:");
        int idadeHomem2 = teclado.nextInt();
        System.out.println("Escreva a idade da Mulher 1:");
        int idadeMulher1 = teclado.nextInt();
        System.out.println("Escreva a idade do Mulher 2:");
        int idadeMulher2 = teclado.nextInt();

        int homemNovo = 0;
        int homemVelho = 0;
        int mulherNova = 0;
        int mulherVelha = 0;

        if (idadeHomem1 < idadeHomem2 && idadeHomem1 != idadeHomem2) {
            homemNovo = idadeHomem1;
            homemVelho = idadeHomem2;
        } else {
            if (idadeHomem1 > idadeHomem2 && idadeHomem1 != idadeHomem2) {
            homemNovo = idadeHomem2;
            homemVelho = idadeHomem1;
            } else {
                System.out.println("ERRO");
            }
        }
        if (idadeMulher1 < idadeMulher2 && idadeMulher1 != idadeMulher2) {
            mulherNova = idadeMulher1;
            mulherVelha = idadeMulher2;
        } else {
            if (idadeMulher1 > idadeMulher2 && idadeMulher1 != idadeMulher2) {
            mulherNova = idadeMulher2;
            mulherVelha = idadeMulher1;
            } else {
                System.out.println("ERRO");
            }
        }
        
        int soma = homemVelho + mulherNova;
        System.out.println("Homem mais velho + mulher mais nova: " + soma);
        int produto = homemNovo * mulherVelha;
        System.out.println("Homem mais novo * mulher mais velha: " + produto);

        teclado.close();
    }
}
