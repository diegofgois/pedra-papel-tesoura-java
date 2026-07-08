package dominio;

public class Jogador {
    protected String nome;
    protected Jogada jogada;

    public Jogador(String nome, Jogada jogada) {
        this.nome = nome;
        this.jogada = jogada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogada getJogada() {
        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }
}
