package main.java.poo.atividade07.q2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaBotao {
    public static void main(String[] args){
        JFrame frame = new JFrame("Exemplo de Botão");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Clique aqui");
        button.setBounds(100, 80, 100, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
