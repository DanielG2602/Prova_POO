package Livros;

public class LivroInfantil {
    public String titulo;
    public String autor;
    public String faixaEtaria;

    public LivroInfantil(String titulo, String autor, String faixaEtaria) {
        this.titulo = titulo;
        this.autor = autor;
        this.faixaEtaria = faixaEtaria;
    }


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getAutor () {
        return autor;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public String getfaixaEtaria () {
        return faixaEtaria;
    }

    public void setfaixaEtaria (String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }



    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("faixaEtaria: " + faixaEtaria);
    }
}
