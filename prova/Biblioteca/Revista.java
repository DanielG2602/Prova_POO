package Biblioteca;

public class Revista {
    public int edicao;

    public Revista (int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao(){
        return edicao;
    }

    public void getAutor (int titulo) {
        this.edicao = edicao;
    }

    public void exibirDetalhes() {
        System.out.println("edicao: " + edicao);
    }
}
