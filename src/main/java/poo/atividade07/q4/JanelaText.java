package main.java.poo.atividade07.q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaText {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(15);
        JButton button = new JButton("Exibir");
        JLabel label = new JLabel("Texto exibido aqui");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                label.setText(inputText);
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
