package main.java.poo.atividade07.q3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaRotulo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela Rotulo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Cliques: 0");
        label.setBounds(110, 20, 100, 30);

        JButton button = new JButton("Clique");
        button.setBounds(100, 80, 100, 30);

        final int[] clickCount = {0};

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount[0]++;
                label.setText("Cliques: " + clickCount[0]);
            }
        });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
