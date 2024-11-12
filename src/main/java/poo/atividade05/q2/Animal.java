package main.java.poo.atividade05.q2;

public class Animal {
    public String nome;
    public String som;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public abstract String emitirSom();
}
