package main.java.poo.atividade06.q11;

class Jogador {
    private String nome;
    private String posicao;
    private int idade;
    private String time;
    private int golsMarcados;

    public Jogador(String nome, String posicao, int idade, String time, int golsMarcados) {
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.time = time;
        this.golsMarcados = golsMarcados;
    }

    public String getNome() { return nome; }
    public String getPosicao() { return posicao; }
    public int getIdade() { return idade; }
    public String getTime() { return time; }
    public int getGolsMarcados() { return golsMarcados; }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", idade=" + idade +
                ", time='" + time + '\'' +
                ", golsMarcados=" + golsMarcados +
                '}';
    }
}
