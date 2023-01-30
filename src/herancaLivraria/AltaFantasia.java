package herancaLivraria;

public class AltaFantasia extends DeFantasia{
    private String tema;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public AltaFantasia(String autor, String ISBN, String nome, int NumPag, String tema){
        super(autor, ISBN, nome, NumPag);
        this.tema=tema;
    }

    public String toString(){
        return "\tDados do Livro: \t" +
                "\n----------------------------------" +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nNúmero de Páginas: " + getNumPag() +
                "\nTema do Livro: " + getTema() +
                "\n----------------------------------";
    }
}