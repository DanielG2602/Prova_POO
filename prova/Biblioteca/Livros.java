package Biblioteca;

public class Livros {
    public String Autor;

    public Livros (String Autor) {
        this.Autor = Autor;
    }

    public String getAutor(){
        return Autor;
    }

    public void getAutor (String titulo) {
        this.Autor = Autor;
    }

    public void exibirDetalhes() {
        System.out.println("Autor: " + Autor);
    }
}
