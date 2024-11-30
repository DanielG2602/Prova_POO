package Biblioteca;

public class ItemBiblioteca {
    public String titulo;
    public int ano_publicacao ;

    public ItemBiblioteca (String titulo, int ano_publicacao ) {
        this.titulo = titulo;
        this.ano_publicacao  = ano_publicacao ;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public int getAno_publicacao  () {
        return ano_publicacao ;
    }

    public void setano_publicacao  (int ano_publicacao ) {
        this.ano_publicacao  = ano_publicacao ;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("ano_publicacao : " + ano_publicacao );
    }
}
