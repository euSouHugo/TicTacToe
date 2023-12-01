public class Game {
// versão 0.1

    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', '|', ' ', '|', ' ' },
                {'-', '+', '-', '+', '-' },
                {' ', '|', ' ', '|', ' ' },
                {'-', '+', '-', '+', '-' },
                {' ', '|', ' ', '|', ' ' }};

        imprimirTabuleiro(tabuleiro);
    }
    public static void imprimirTabuleiro(char[][] tabuleiro){
        for (char[] row: tabuleiro){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}