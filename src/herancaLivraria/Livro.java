package herancaLivraria;

public class Livro {
    private String nome;
    private String autor;
    private String ISBN;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Livro(String autor, String ISBN, String nome){
        this.autor=autor;
        this.ISBN=ISBN;
        this.nome=nome;
    }


}
