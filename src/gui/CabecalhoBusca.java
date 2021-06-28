package gui;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CabecalhoBusca extends JPanel {
    private int posX;
    private int posY;
    private int largura;
    private int altura;
    private JTextField campoBusca;
    private JCheckBox apartamentoCheck;
    private JCheckBox casaCheck;
    private JButton buscar;
    private JButton vender;
    private JButton meusImoveis;

    public CabecalhoBusca(int posX, int posY, int largura, int altura)  {
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;

        this.campoBusca = new JTextField(100);
        this.apartamentoCheck = new JCheckBox("Apartamento");
        this.casaCheck = new JCheckBox("Casa");
        this.buscar = new JButton("BUSCAR");
        this.vender = new JButton("QUERO VENDER");
        this.meusImoveis = new JButton("MEUS IMOVEIS");

        this.setBounds(posX, posY, largura, altura);
        this.setBackground(Color.lightGray);
        this.campoBusca.setPreferredSize(new Dimension(1024, 40));

        this.adicionarComponentes();
    }

    private void adicionarComponentes() {
        this.add(this.campoBusca);
        this.add(this.buscar);
        this.add(this.apartamentoCheck);
        this.add(this.casaCheck);
        this.add(this.vender);
        this.add(this.meusImoveis);
    }
}