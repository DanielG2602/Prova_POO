package Livros;

public class TestLivro {
    public static void main(String[] args) {
        Livro Livro = new Livro("Homem Formiga","bil gates");
        LivroInfantil LivroInfantil = new LivroInfantil("Dona Aranha","galinha pintadinha","18 anos");
        LivroTecnico LivroTecnico = new LivroTecnico("meu mundo", "meu malvado favorito", 11);

        System.out.println();
        Livro.exibirDetalhes();

        System.out.println();
        LivroInfantil.exibirDetalhes();

        System.out.println();
        LivroTecnico.exibirDetalhes();
    }
}
