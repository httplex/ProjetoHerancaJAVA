package herancaLivraria;

public class Epoca extends DeRomance{
    private int decada;

    public int getDecada() {
        return decada;
    }

    public void setDecada(int decada) {
        this.decada = decada;
    }

    public Epoca(String autor, String ISBN, String nome, String editora, int decada){
        super(autor, ISBN, editora, nome);
        this.decada=decada;
    }

    public String toString(){
        return "Dados do Livro: " +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nEditora: " + getEditora() +
                "\nDécada: " + getDecada();
    }
}