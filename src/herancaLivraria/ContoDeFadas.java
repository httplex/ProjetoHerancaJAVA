package herancaLivraria;

public class ContoDeFadas extends DeFantasia{
    private String tipoNarrador;

    public String getTipoNarrador() {
        return tipoNarrador;
    }

    public void setTipoNarrador(String tipoNarrador) {
        this.tipoNarrador = tipoNarrador;
    }

    ContoDeFadas(String autor, String ISBN, String nome, int NumPag, String tipoNarrador){
        super(autor, ISBN, nome, NumPag);
        this.tipoNarrador=tipoNarrador;
    }

    public String toString(){
        return "Dados do Livro: " +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nNúmero de Páginas: " + getNumPag() +
                "\nTipo de Narrador: " + getTipoNarrador();
    }
}

