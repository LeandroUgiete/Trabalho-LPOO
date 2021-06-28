package gui;

import javax.swing.JButton;

public class Botao extends JButton {
    private int posX;
    private int posY;
    private int largura;
    private int altura;


    public Botao(String texto, int posX, int posY, int largura, int altura)  {
        super(texto);

        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;

        this.setBounds(posX, posY, largura, altura);
    }
}