package org.example;

public class Velha {

	    // Um array bidimensional para armazenar o tabuleiro do jogo
	    private char[][] tabuleiro;

	    // Uma variável para armazenar o símbolo do jogador atual
	    private char jogador;

	    // Um construtor que inicializa o tabuleiro e o jogador
	    public Velha() {
	        // Criando um tabuleiro de 3 por 3
	        tabuleiro = new char[3][3];
	        // Preenchendo o tabuleiro com espaços vazios
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tabuleiro[i][j] = ' ';
	            }
	        }
	        // Definindo o jogador inicial como 'X'
	        jogador = 'X';
	    }

	    // Um método que verifica se o tabuleiro está cheio
	    public boolean tabuleiroCheio() {
	        // Um laço for para percorrer o tabuleiro
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                // Se houver algum espaço vazio, retornar falso
	                if (tabuleiro[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }
	        // Se não houver nenhum espaço vazio, retornar verdadeiro
	        return true;
	    }

	    // Um método que verifica se há um vencedor
	    public boolean haVencedor() {
	        // Verificando as linhas do tabuleiro
	        for (int i = 0; i < 3; i++) {
	            // Se a linha tiver três símbolos iguais e diferentes de espaço, retornar verdadeiro
	            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
	                return true;
	            }
	        }
	        // Verificando as colunas do tabuleiro
	        for (int j = 0; j < 3; j++) {
	            // Se a coluna tiver três símbolos iguais e diferentes de espaço, retornar verdadeiro
	            if (tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j] && tabuleiro[0][j] != ' ') {
	                return true;
	            }
	        }
	        // Verificando as diagonais do tabuleiro
	        // Se a diagonal principal tiver três símbolos iguais e diferentes de espaço, retornar verdadeiro
	        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
	            return true;
	        }
	        // Se a diagonal secundária tiver três símbolos iguais e diferentes de espaço, retornar verdadeiro
	        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
	            return true;
	        }
	        // Se não houver nenhuma condição de vitória, retornar falso
	        return false;
	    }

	    // Um método que verifica se uma jogada é válida
	    public boolean jogadaValida(int linha, int coluna) {
	        // Se a linha e a coluna estiverem dentro dos limites do tabuleiro e o espaço estiver vazio, retornar verdadeiro
	        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
	            return true;
	        }
	        // Se não, retornar falso
	        return false;
	    }

	    // Um método que realiza uma jogada
	    public void fazerJogada(int linha, int coluna) {
	        // Se a jogada for válida, marcar o símbolo do jogador no tabuleiro e trocar o jogador
	        if (jogadaValida(linha, coluna)) {
	            tabuleiro[linha][coluna] = jogador;
	            trocarJogador();
	        }
	    }

	    // Um método que troca o jogador atual
	    public void trocarJogador() {
	        // Se o jogador atual for 'X', trocar para 'O'
	        if (jogador == 'X') {
	            jogador = 'O';
	        }
	        // Se o jogador atual for 'O', trocar para 'X'
	        else if (jogador == 'O') {
	            jogador = 'X';
	        }
	    }

	    // Um método que imprime o tabuleiro na tela
	    public void imprimirTabuleiro() {
	        // Um laço for para percorrer as linhas do tabuleiro
	        for (int i = 0; i < 3; i++) {
	            // Imprimindo uma linha horizontal
	            System.out.println("-------------");
	            // Um laço for para percorrer as colunas do tabuleiro
	            for (int j = 0; j < 3; j++) {
	                // Imprimindo uma barra vertical e o símbolo da posição
	                System.out.print("| " + tabuleiro[i][j] + " ");
	            }
	            // Imprimindo uma barra vertical e uma quebra de linha
	            System.out.println("|");
	        }
	        // Imprimindo uma linha horizontal
	        System.out.println("-------------");
	    }

	    // Um método principal para executar o jogo
	    public static void main(String[] args) {
	        // Criando um objeto da classe JogoDaVelha
	        Velha jogo = new Velha();
	        // Imprimindo uma mensagem de boas-vindas
	        System.out.println("Bem-vindo ao jogo da velha!");
	        // Imprimindo o tabuleiro inicial
	        jogo.imprimirTabuleiro();
	        // Um laço while para repetir até o fim do jogo
	        while (true) {
	            // Imprimindo o jogador atual
	            System.out.println("Vez do jogador " + jogo.jogador);
	            // Lendo a linha e a coluna da jogada do usuário
	            System.out.print("Digite a linha (0, 1 ou 2): ");
	            int linha = Integer.parseInt(System.console().readLine());
	            System.out.print("Digite a coluna (0, 1 ou 2): ");
	            int coluna = Integer.parseInt(System.console().readLine());
	            // Fazendo a jogada
	            jogo.fazerJogada(linha, coluna);
	            // Imprimindo o tabuleiro atualizado
	            jogo.imprimirTabuleiro();
	            // Verificando se há um vencedor
	            if (jogo.haVencedor()) {
	                // Imprimindo uma mensagem de parabéns ao jogador vencedor e encerrando o laço
	                System.out.println("Parabéns, jogador " + jogo.jogador + "! Você venceu o jogo!");
	                break;
	            }
	            // Verificando se o tabuleiro está cheio
	            if (jogo.tabuleiroCheio()) {
	                // Imprimindo uma mensagem de empate e encerrando o laço
	                System.out.println("O jogo terminou em empate!");
	                break;
	            }
	        }
	    }
	}
