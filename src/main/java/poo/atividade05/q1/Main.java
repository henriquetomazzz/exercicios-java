package main.java.poo.atividade05.q1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", "Honda", 4);
        Caminhao caminhao = new Caminhao("FH", "Volvo", 18.0);

        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes do Caminhão:");
        caminhao.exibirDetalhes();
    }
}
