package main.java.poo.atividade05.q1;

public class Caminhao extends Veiculo{
    private double capacidade;

    public Caminhao(String fabricante, String modelo, double capacidade) {
        super(fabricante, modelo);
        this.capacidade = capacidade;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade: " + capacidade + " toneladas");
    }
}
