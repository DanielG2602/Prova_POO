package Biblioteca;

public class MidiaDigital {
    public String formato;

    public MidiaDigital (String formato) {
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }

    public void setFormato (String titulo) {
        this.formato = formato;
    }

    public void exibirDetalhes() {
        System.out.println("formato: " + formato);
    }
}
