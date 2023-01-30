package herancaLivraria;

public class DeRomance extends Livro{
    private String editora;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public DeRomance(String autor, String ISBN, String nome, String editora){
        super(autor, ISBN, nome);
        this.editora=editora;
    }

    public String toString(){
        return "Dados do Livro: " +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nEditora: " + getEditora();
    }
}