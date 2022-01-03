public class PalavraCruzadaPalavras {
    private final int palavrasQtdLinha = 5;
    private final int palavrasQtdColuna = 2;
    private String[][] palavras = new String[palavrasQtdLinha][palavrasQtdColuna];

    public PalavraCruzadaPalavras() {
        palavrasEntrada();
    }

    public String[][] palavrasVetor() {
        return palavras;
    }

    private void palavrasEntrada() {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";
    }

    public void palavrasSaidaNaoResolvido() {
        for (int i = 0; i < 5; i++) {
            System.out.println(palavras[i][0]);
        }
    }

    public void palavrasSaidaResolvido() {
        for (int i = 0; i < palavras.length; i++) {
            String encontrou = palavras[i][1];

            if (encontrou != null) {
                System.out.println(palavras[i][1]);
            } else {
                System.out.println("....NÃO achou");
            }
        }
    }

}