import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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

        List<Integer> listaMarcados = new ArrayList<>(); // lista que usarei para saber as posições.

        imprimirTabuleiro(tabuleiro);

        String player = new String("player");
        String computador = new String("computador");

        // loop do jogo
        while(true){

            // vez do player

            System.out.print("Digite uma posição: ");
            Scanner scanner = new Scanner(System.in);
            int pos = scanner.nextInt();
            botarMarca(tabuleiro,pos,player);
            imprimirTabuleiro(tabuleiro);

            // vez do computador

            System.out.print("Digite uma posição: ");
            Scanner scanner_comp = new Scanner(System.in);
            int pos_comp = scanner.nextInt();
            botarMarca(tabuleiro,pos_comp,computador);
            imprimirTabuleiro(tabuleiro);


        }

    }
    public static void imprimirTabuleiro(char[][] tabuleiro){
        for (char[] row: tabuleiro){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void botarMarca(char[][] tabuleiro, int pos, String jogador){

        // utilizar como parâmetro uma função que retorna true se a posição já tenha sido marcada

        char z = ' ';
        if (jogador.equals("player")){
            z = 'X';
        }else if (jogador.equals("computador")){
            z = 'O';
        }
        switch (pos){
            case 1:
                tabuleiro [0][0] = z;
                break;
            case 2:
                tabuleiro [0][2] = z;
                break;
            case 3:
                tabuleiro [0][4] = z;
                break;
            case 4:
                tabuleiro [2][0] = z;
                break;
            case 5:
                tabuleiro [2][2] = z;
                break;
            case 6:
                tabuleiro [2][4] = z;
                break;
            case 7:
                tabuleiro [4][0] = z;
                break;
            case 8:
                tabuleiro [4][2] = z;
                break;
            case 9:
                tabuleiro [4][4] = z;
            default:
                System.out.println("Selecione uma posição válida!");
                break;
        }
    }
    public static boolean checarVencedor(){
        return false;
    }
}
