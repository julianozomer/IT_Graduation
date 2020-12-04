import java.util.Scanner; ////////******* */

public class Uni5Exe23 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        int qtdProdutosVendidos = 0;
        double preço = 0;
        double salarioVendedor;
        int qtdVendida = 0;
        double totalVendido = 0;
        char resposta = 's';

        while (resposta == 's') {
            System.out.print("Digite o nome do vendedor: ");
            nome = teclado.next();
            System.out.print("Digite a quantidade de produtos diferentes vendidos: ");
            qtdProdutosVendidos = teclado.nextInt();
            for (int contador = 1; contador <= qtdProdutosVendidos; contador++) {
                System.out.print("Valor produto vendido: R$ ");
                preço = teclado.nextDouble();
                System.out.print("Quantidade vendida deste produto:  ");
                qtdVendida = teclado.nextInt();
                totalVendido += preço * qtdVendida;
            }
            salarioVendedor = totalVendido * 0.30;

            System.out.println("==========================================================");
            System.out.println("Nome do Funcionário: " + nome + "; Total de Vendas:R$ " + totalVendido + " Salário: R$"
                    + salarioVendedor);
            System.out.println("==========================================================");
            System.out.print("Deseja digitar os dados de mais um vendedor? [S/N]: ");
            resposta = teclado.next().charAt(0);
            while ((resposta != 's') && (resposta != 'n')) {
                System.out.println("Opção inválida");
                System.out.print("Deseja digitar os dados de mais um vendedor? [S/N]: ");
                resposta = teclado.next().charAt(0);
            }

        }
        teclado.close();
    }

}