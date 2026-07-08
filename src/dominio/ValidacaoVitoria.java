package dominio;

public class ValidacaoVitoria {
    public void validadorVitoria(Jogador jogador1, Jogador jogador2) {
        Jogada jogadaJogador1 = jogador1.getJogada();
        Jogada jogadaJogador2 = jogador2.getJogada();

        if (jogadaJogador1 == jogadaJogador2) { // Situação de empate
            System.out.println("Empate!");
            return;
        }

        // Jogador 1 ganhando
        if (jogadaJogador1 == Jogada.TESOURA && jogadaJogador2 == Jogada.PAPEL || jogadaJogador1 == Jogada.PAPEL && jogadaJogador2 == Jogada.PEDRA || jogadaJogador1 == Jogada.PEDRA && jogadaJogador2 == Jogada.TESOURA) {
            System.out.println("Jogador 1 Ganhou!");
        } else { // Jogador 2 ganhando
            System.out.println("Jogador 2 Ganhou!");
        }
    }
}
