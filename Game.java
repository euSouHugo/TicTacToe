import java.util.Scanner;
public class Game {
// versão 0.1

    public static void main(String[] args) {
        char[][] tabuleiro = {
                {' ', '|', ' ', '|', ' ' },
                {'-', '+', '-', '+', '-' },
                {' ', '|', ' ', '|', ' ' },
                {'-', '+', '-', '+', '-' },
                {' ', '|', ' ', '|', ' ' }
        };

        imprimirTabuleiro(tabuleiro);

        // loop do jogo (ainda sem o loop em si):

        System.out.print("Digite uma posição: ");
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        botarMarca(tabuleiro, pos);
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
    public static void botarMarca(char[][] tabuleiro, int pos){
        switch (pos){
            case 1:
                tabuleiro [0][0] = 'X';
                break;
            case 2:
                tabuleiro [0][2] = 'X';
                break;
            case 3:
                tabuleiro [0][4] = 'X';
            case 4:
                tabuleiro [2][0] = 'X';
                break;
            case 5:
                tabuleiro [2][2] = 'X';
                break;
            case 6:
                tabuleiro [2][4] = 'X';
            case 7:
                tabuleiro [4][0] = 'X';
                break;
            case 8:
                tabuleiro [4][2] = 'X';
                break;
            case 9:
                tabuleiro [4][4] = 'X';
        }
    }
}