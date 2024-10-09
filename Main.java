import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //Array com as 9 posições jogaveis
        String[] posicoes = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};

        //tela inicial do jogo.
        System.out.println("Jogo da velha");
        System.out.println(
                          posicoes[0] + "  " + posicoes[1] + "  " + posicoes[2] + "\n"
                        + posicoes[3] + "  " + posicoes[4] + "  " + posicoes[5] + "\n"
                        + posicoes[6] + "  " + posicoes[7] + "  " + posicoes[8]);

        //variaveis necessárias.
        int verificarVitoria = 0;
        int i = 0;

        //Alternando entre jogadores com laço for e recebendo a opção dos jogadores e alterando na tela do jogo,
        //além de verificar se houve ganhador a qualquer momento.
        while (i < 9) {
            if (i % 2 == 0) {
                System.out.println("Jogador X: Escolha uma posição para jogar!");
                Scanner ler = new Scanner(System.in);
                int jogadorX = ler.nextInt();
                switch (jogadorX) {
                    case 0:
                        posicoes[0] = "X";
                        break;
                    case 1:
                        posicoes[1] = "X";
                        break;
                    case 2:
                        posicoes[2] = "X";
                        break;
                    case 3:
                        posicoes[3] = "X";
                        break;
                    case 4:
                        posicoes[4] = "X";
                        break;
                    case 5:
                        posicoes[5] = "X";
                        break;
                    case 6:
                        posicoes[6] = "X";
                        break;
                    case 7:
                        posicoes[7] = "X";
                        break;
                    case 8:
                        posicoes[8] = "X";
                        break;
                    default:
                        System.out.println("Opção inválida, perdeu a vez!");
                        break;
                }
                System.out.println(
                                  posicoes[0] + "  " + posicoes[1] + "  " + posicoes[2] + "\n"
                                + posicoes[3] + "  " + posicoes[4] + "  " + posicoes[5] + "\n"
                                + posicoes[6] + "  " + posicoes[7] + "  " + posicoes[8]);

                if (       posicoes[0] == posicoes[1] && posicoes[1] == posicoes[2]
                        || posicoes[0] == posicoes[4] && posicoes[4] == posicoes[8]
                        || posicoes[0] == posicoes[3] && posicoes[3] == posicoes[6]
                        || posicoes[1] == posicoes[4] && posicoes[4] == posicoes[7]
                        || posicoes[6] == posicoes[4] && posicoes[4] == posicoes[2]
                        || posicoes[2] == posicoes[5] && posicoes[5] == posicoes[8]
                        || posicoes[6] == posicoes[7] && posicoes[7] == posicoes[8]
                        || posicoes[3] == posicoes[4] && posicoes[4] == posicoes[5]
                ) {
                    verificarVitoria = 1;
                    break;
                }
                i++;
            } else {
                System.out.println("Jogador O: Escolha uma posição para jogar!");
                Scanner ler = new Scanner(System.in);
                int jogadorO = ler.nextInt();
                switch (jogadorO) {
                    case 0:
                        posicoes[0] = "O";
                        break;
                    case 1:
                        posicoes[1] = "O";
                        break;
                    case 2:
                        posicoes[2] = "O";
                        break;
                    case 3:
                        posicoes[3] = "O";
                        break;
                    case 4:
                        posicoes[4] = "O";
                        break;
                    case 5:
                        posicoes[5] = "O";
                        break;
                    case 6:
                        posicoes[6] = "O";
                        break;
                    case 7:
                        posicoes[7] = "O";
                        break;
                    case 8:
                        posicoes[8] = "O";
                        break;
                    default:
                        System.out.println("Opção inválida, perdeu a vez!");
                        break;
                }
                System.out.println(
                                  posicoes[0] + "  " + posicoes[1] + "  " + posicoes[2] + "\n"
                                + posicoes[3] + "  " + posicoes[4] + "  " + posicoes[5] + "\n"
                                + posicoes[6] + "  " + posicoes[7] + "  " + posicoes[8]);

                if (       posicoes[0] == posicoes[1] && posicoes[1] == posicoes[2]
                        || posicoes[0] == posicoes[4] && posicoes[4] == posicoes[8]
                        || posicoes[0] == posicoes[3] && posicoes[3] == posicoes[6]
                        || posicoes[1] == posicoes[4] && posicoes[4] == posicoes[7]
                        || posicoes[6] == posicoes[4] && posicoes[4] == posicoes[2]
                        || posicoes[2] == posicoes[5] && posicoes[5] == posicoes[8]
                        || posicoes[6] == posicoes[7] && posicoes[7] == posicoes[8]
                        || posicoes[3] == posicoes[4] && posicoes[4] == posicoes[5]
                ) {
                    verificarVitoria = 2;
                    break;
                }
                i++;
            }
        }

        //tela pós jogo
        System.out.println("FIM DE JOGO!");
        if (verificarVitoria == 1) {
            System.out.println("Jogador X VENCEU!");
        } else if (verificarVitoria == 2) {
            System.out.println("Jogador O VENCEU!");
        } else {
            System.out.println("Terminou EMPATADO!");
        }
    }
}
