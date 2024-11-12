package main.java.poo.atividade05.q1;

public class Veiculo {
    private String fabricante;
    private String modelo;

    public Veiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
    }
}
