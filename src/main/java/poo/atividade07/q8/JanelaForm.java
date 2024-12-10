package main.java.poo.atividade07.q8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JButton enviarButton = new JButton("Enviar");
        JLabel mensagemLabel = new JLabel("", SwingConstants.CENTER);

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensagemLabel.setText("Cadastro enviado!");
            }
        });

        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(new JLabel());
        frame.add(enviarButton);
        frame.add(new JLabel());
        frame.add(mensagemLabel);

        frame.setVisible(true);
    }
}

