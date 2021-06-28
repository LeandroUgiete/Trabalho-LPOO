import gui.Janela;
import gui.CabecalhoBusca;

class Main {
    public static void main(String args[]) {
        Janela frame = new Janela("Trabalho LPOO", 1366, 920);

        CabecalhoBusca cabecalho = new CabecalhoBusca(0, 0, 1366, 100);
        
        frame.adicionarComponente(cabecalho);
    }
}