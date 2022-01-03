public class PalavraCruzadaMapa {
    private final int mapaQtdLinha = 10;
    private final int mapaQtdColuna = 5;
    private char[][] mapa = new char[mapaQtdLinha][mapaQtdColuna];

    public PalavraCruzadaMapa() {
        mapaEntrada();
    }

    private void mapaLinha() {
        for (int i = 0; i < mapaQtdColuna; i++) {
            System.out.print("----");
        }
        System.out.print("-");
        System.out.println();

    }

    public void mapaSaidaNaoResolvido() {
        mapaLinha();
        for (int i = 0; i < mapaQtdLinha; i++) {
            System.out.print("| ");
            for (int j = 0; j < mapaQtdColuna; j++) {
                System.out.print(mapa[i][j] + " | ");
            }
            System.out.println();
            mapaLinha();
        }
    }

    public void mapaBusca(String[][] palavras) {
            int caracterAtual;
        // for palavras
        for (int palavraAtual = 0; palavraAtual < 5; palavraAtual++) {
            caracterAtual = 0;
            // palavras[palavraAtual][0]
            // mapa:cima/baixo e esquerda/direita
            for (int mapaLin = 0; mapaLin < mapaQtdLinha; mapaLin++) {
                for (int mapaCol = 0; mapaCol < mapaQtdColuna; mapaCol++) {
                    // mapa[i][j]
                    if (mapa[mapaLin][mapaCol] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                        caracterAtual++;
                    
                    }

                }
            }
            // mapa:cima/baixo e direita/esquerda
            for (int mapaLin = 0; mapaLin < mapaQtdLinha; mapaLin++) {
                for (int mapaCol = mapaQtdColuna - 1; mapaCol >= 0; mapaCol--) {
                    // mapa[i][j]
                    if (mapa[mapaLin][mapaCol] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                        caracterAtual++;
                    }
                }
            }
            // mapa:baixo/cima e esquerda/direita
            for (int mapaLin = mapaQtdLinha - 1; mapaLin >= 0; mapaLin--) {
                for (int mapaCol = 0; mapaCol < mapaQtdColuna; mapaCol++) {
                    // mapa[i][j]
                    if (mapa[mapaLin][mapaCol] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                        caracterAtual++;
                    }
                }
            }
            // mapa:baixo/cima e direita/esquerda
            for (int mapaLin = mapaQtdLinha - 1; mapaLin >= 0; mapaLin--) {
                for (int mapaCol = mapaQtdColuna - 1; mapaCol >= 0; mapaCol--) {
                    // mapa[i][j]
                    if (mapa[mapaLin][mapaCol] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                        caracterAtual++;
                    }
                }
            }
        }
    }

    private void mapaEntrada() {
        mapa[0][0] = 'C';
        mapa[0][1] = 'C';
        mapa[0][2] = 'Q';
        mapa[0][3] = 'W';
        mapa[0][4] = 'E';
        mapa[1][0] = 'I';
        mapa[1][1] = 'X';
        mapa[1][2] = 'F';
        mapa[1][3] = 'O';
        mapa[1][4] = 'R';
        mapa[2][0] = 'F';
        mapa[2][1] = 'F';
        mapa[2][2] = 'R';
        mapa[2][3] = 'G';
        mapa[2][4] = 'F';
        mapa[3][0] = 'E';
        mapa[3][1] = 'L';
        mapa[3][2] = 'I';
        mapa[3][3] = 'H';
        mapa[3][4] = 'W';
        mapa[4][0] = 'L';
        mapa[4][1] = 'S';
        mapa[4][2] = 'F';
        mapa[4][3] = 'O';
        mapa[4][4] = 'U';
        mapa[5][0] = 'S';
        mapa[5][1] = 'D';
        mapa[5][2] = 'G';
        mapa[5][3] = 'T';
        mapa[5][4] = 'S';
        mapa[6][0] = 'E';
        mapa[6][1] = 'J';
        mapa[6][2] = 'H';
        mapa[6][3] = 'E';
        mapa[6][4] = 'T';
        mapa[7][0] = 'I';
        mapa[7][1] = 'I';
        mapa[7][2] = 'I';
        mapa[7][3] = 'J';
        mapa[7][4] = 'M';
        mapa[8][0] = 'X';
        mapa[8][1] = 'C';
        mapa[8][2] = 'K';
        mapa[8][3] = 'B';
        mapa[8][4] = 'G';
        mapa[9][0] = 'V';
        mapa[9][1] = 'E';
        mapa[9][2] = 'T';
        mapa[9][3] = 'O';
        mapa[9][4] = 'R';
    }
}
