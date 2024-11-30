package Biblioteca;

public class testBiblioteca {
    public static void main(String[] args) {
        Livros Livro = new Livros("Homem Formiga");
        ItemBiblioteca ItemBiblioteca = new ItemBiblioteca("Homem Formiga", 12);
        Revista Revista = new Revista(18);
        MidiaDigital MidiaDigital = new MidiaDigital("meu mundo");

        System.out.println();
        ItemBiblioteca.exibirDetalhes();

        System.out.println();
        Livro.exibirDetalhes();

        System.out.println();
        Revista.exibirDetalhes();

        System.out.println();
        MidiaDigital.exibirDetalhes();

    }
}
