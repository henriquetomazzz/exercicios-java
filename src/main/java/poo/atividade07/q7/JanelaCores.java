package main.java.poo.atividade07.q7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCores {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mudar Cor de Fundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JButton botaoVermelho = new JButton("Vermelho");
        JButton botaoVerde = new JButton("Verde");
        JButton botaoAzul = new JButton("Azul");

        botaoVermelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        botaoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        botaoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        frame.add(botaoVermelho);
        frame.add(botaoVerde);
        frame.add(botaoAzul);

        frame.setVisible(true);
    }
}

