package main.java.poo.atividade05.q1;

public class Carro extends Veiculo {
    private int numPorta;
    public Carro(String fabricante, String modelo, int numPorta) {
        super(fabricante, modelo);
        this.numPorta = numPorta;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numPorta);
    }
}
