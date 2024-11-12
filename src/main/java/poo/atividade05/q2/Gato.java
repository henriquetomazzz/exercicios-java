package main.java.poo.atividade05.q2;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome, "miado");
    }
    public String emitirSom(){
        return "O" + nome + " faz:" + som;
    }
}
