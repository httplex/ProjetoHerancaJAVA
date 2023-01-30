package herancaLivraria;

public class Folclorico extends ContoDeFadas{
    private String local;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Folclorico(String autor, String ISBN, String nome, int NumPag, String tipoNarrador, String local){
        super(autor, ISBN, nome, NumPag, tipoNarrador);
        this.local=local;
    }

    public String toString(){
        return "\tDados do Livro: \t" +
                "\n--------------------------------------------" +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nNúmero de Páginas: " + getNumPag() +
                "\nTipode de Narrador: " + getTipoNarrador() +
                "\nLocal em que se passa a história: " + getLocal() +
                "\n--------------------------------------------";
    }
}
