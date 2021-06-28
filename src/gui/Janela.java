package gui;

import javax.swing.JFrame;
import java.awt.Component;

public class Janela extends JFrame {
    private int largura;
    private int altura;

    public Janela(String titulo, int largura, int altura) {
        super(titulo);

        this.largura = largura;
        this.altura = altura;

        this.desenhaJanela();
    }

    private void desenhaJanela() {
        this.setVisible(true);
        this.setSize(this.largura, this.altura);
        //this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void adicionarComponente(Component novoComponente) {
        this.getContentPane().add(novoComponente);
    }
}