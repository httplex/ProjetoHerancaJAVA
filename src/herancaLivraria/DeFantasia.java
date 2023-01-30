package herancaLivraria;

public class DeFantasia extends Livro{
    private int NumPag;

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public DeFantasia(String autor, String ISBN, String nome, int NumPag){
        super(autor, ISBN, nome);
        this.NumPag=NumPag;
    }

    public String toString(){
        return "Dados do Livro: " +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nIBSN: " + getISBN() +
                "\nNúmero de Páginas: " + getNumPag();
    }
}
