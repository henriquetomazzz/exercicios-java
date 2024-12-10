package main.java.poo.atividade07.q9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class JanelaDesenho {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Painel de Desenho");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        DesenhoPanel desenhoPanel = new DesenhoPanel();
        frame.add(desenhoPanel);

        frame.setVisible(true);
    }
}

class DesenhoPanel extends JPanel {
    private final ArrayList<PontoCirculo> circulos;
    private final int tamanho = 40;
    private final Color cor = Color.BLUE;

    public DesenhoPanel() {
        circulos = new ArrayList<>();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                circulos.add(new PontoCirculo(e.getX(), e.getY(), tamanho, cor));
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (PontoCirculo circulo : circulos) {
            g.setColor(circulo.getCor());
            g.fillOval(circulo.getX() - circulo.getTamanho() / 2,
                    circulo.getY() - circulo.getTamanho() / 2,
                    circulo.getTamanho(), circulo.getTamanho());
        }
    }
}

class PontoCirculo {
    private final int x;
    private final int y;
    private final int tamanho;
    private final Color cor;

    public PontoCirculo(int x, int y, int tamanho, Color cor) {
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Color getCor() {
        return cor;
    }
}

