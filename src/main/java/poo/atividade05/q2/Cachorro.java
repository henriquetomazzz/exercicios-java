package main.java.poo.atividade05.q2;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome, "latido");
    }

    @Override
    public String emitirSom() {
        return "O" + nome + " faz: " + som;
    }
}
