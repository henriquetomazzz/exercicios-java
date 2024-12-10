package main.java.poo.atividade07.q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSomador {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Soma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(4, 1));

        JTextField numero1Field = new JTextField();
        JTextField numero2Field = new JTextField();

        JButton somarButton = new JButton("Somar");

        JLabel resultadoLabel = new JLabel("Resultado: ", SwingConstants.CENTER);

        somarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(numero1Field.getText());
                    double numero2 = Double.parseDouble(numero2Field.getText());

                    double soma = numero1 + numero2;

                    resultadoLabel.setText("Resultado: " + soma);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(new JLabel("Número 1: "));
        frame.add(numero1Field);
        frame.add(new JLabel("Número 2: "));
        frame.add(numero2Field);
        frame.add(somarButton);
        frame.add(resultadoLabel);

        frame.setVisible(true);
    }
}
