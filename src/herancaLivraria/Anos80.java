package herancaLivraria;

public class Anos80 extends Epoca{
    private String edicao;

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public Anos80(String autor, String ISBN, String nome, String editora, int decada, String edicao){
        super(autor, ISBN, nome, editora, decada);
        this.edicao=edicao;
    }

    public String toString(){
        return "\tDados do Livro: \t" +
                "\n-------------------------------" +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nEditora: " + getEditora() +
                "\nDécada: " + getDecada() +
                "\nEdição: " + getEdicao() +
                "\n-------------------------------";
    }
}
