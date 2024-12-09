package main.java.poo.atividade07.q1;

import javax.swing.*;

public class MinhaPrimeiraJanela {

    private JFrame frame;

    public MinhaPrimeiraJanela(){
        frame = new JFrame();
        frame.setTitle("Novo Exemplo");
        frame.setSize(400, 300);
    }

    public void mostrar(){
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        MinhaPrimeiraJanela janela = new MinhaPrimeiraJanela();
        janela.mostrar();
    }
}
