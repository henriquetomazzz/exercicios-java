package main.java.poo.atividade07.q6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JanelaLista {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista de Frutas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        String[] frutas = {"Maçã", "Banana", "Laranja", "Manga", "Pera", "Uva", "Abacaxi"};

        JList<String> listaFrutas = new JList<>(frutas);
        listaFrutas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(listaFrutas);

        JLabel frutaSelecionadaLabel = new JLabel("Fruta selecionada: Nenhuma", SwingConstants.CENTER);

        listaFrutas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String frutaSelecionada = listaFrutas.getSelectedValue();
                if (frutaSelecionada != null) {
                    frutaSelecionadaLabel.setText("Fruta selecionada: " + frutaSelecionada);
                }
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(frutaSelecionadaLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

