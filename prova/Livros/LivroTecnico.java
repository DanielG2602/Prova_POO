package Livros;

public class LivroTecnico {
    public String titulo;
    public String autor;
    public int area;

    public LivroTecnico(String titulo, String autor, int area) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
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

    public int getArea () {
        return area;
    }

    public void setArea (int area) {
        this.area = area;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Area: " + area);
    }
}
