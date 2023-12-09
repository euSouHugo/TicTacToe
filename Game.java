import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Game {

    static List<Integer> listaMarcados = new ArrayList<>(); // lista que usarei para saber as posições.
    static int pos_comp;
    static int pos_player;
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {' ', '|', ' ', '|', ' ' },
                {'-', '+', '-', '+', '-' },
                {' ', '|', ' ', '|', ' ' },
                {'-', '+', '-', '+', '-' },
                {' ', '|', ' ', '|', ' ' }
        };

        imprimirTabuleiro(tabuleiro);

        String player = new String("player");
        String computador = new String("computador");

        // loop do jogo
        while(true){

            // vez do player

            System.out.print("Digite uma posição: ");
            Scanner scanner = new Scanner(System.in);
            pos_player = scanner.nextInt();
            foiMarcada(pos_player);
            botarMarca(tabuleiro,pos_player,player,foiMarcada(pos_player));
            imprimirTabuleiro(tabuleiro);

            // vez do computador

            System.out.print("Digite uma posição: ");
            Scanner scanner_comp = new Scanner(System.in);
            pos_comp = scanner.nextInt();
            foiMarcada(pos_comp);
            botarMarca(tabuleiro,pos_comp,computador,foiMarcada(pos_comp));
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
    public static boolean foiMarcada(int pos){
        if (listaMarcados.contains(pos)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void botarMarca(char[][] tabuleiro, int pos, String jogador, boolean foiMarcada){

        // utilizar como parâmetro uma função que retorna true se a posição já tenha sido marcada

        char z = ' ';
        if (jogador.equals("player")){
            z = 'X';
            listaMarcados.add(pos_player);
        }else if (jogador.equals("computador")){
            z = 'O';
            listaMarcados.add(pos_comp);
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
