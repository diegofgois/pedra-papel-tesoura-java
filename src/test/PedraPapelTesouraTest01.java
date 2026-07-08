package test;

import dominio.Jogada;
import dominio.Jogador;
import dominio.ValidacaoVitoria;

public class PedraPapelTesouraTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fulano 1", Jogada.PAPEL);
        Jogador jogador2 = new Jogador("Fulano 2", Jogada.TESOURA);
        ValidacaoVitoria validador = new ValidacaoVitoria();
        validador.validadorVitoria(jogador1, jogador2);
    }
}
