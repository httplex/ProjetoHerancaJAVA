package herancaLivraria;

public class LGBT extends DeRomance{
    private String corcapa;

    public String getCorcapa() {
        return corcapa;
    }

    public void setCorcapa(String corcapa) {
        this.corcapa = corcapa;
    }

    public LGBT(String autor, String ISBN, String nome, String editora, String corcapa){
        super(autor, ISBN, nome, editora);
        this.corcapa=corcapa;
    }

    public String toString(){
        return "\tDados do Livro: \t" +
                "\n----------------------------------" +
                "\nAutor: " + getAutor() +
                "\nNome: " + getNome() +
                "\nISBN: " + getISBN() +
                "\nEditora: " + getEditora() +
                "\nCor da capa: " + getCorcapa() +
                "\n----------------------------------";
    }
}