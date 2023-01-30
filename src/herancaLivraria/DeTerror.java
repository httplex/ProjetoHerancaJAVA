package herancaLivraria;

public class DeTerror extends Livro{
    private int AnoLancamento;

    public int getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(int AnoLancamento) {
        this.AnoLancamento = AnoLancamento;
    }

    public DeTerror(String autor, String ISBN, String nome, int AnoLancamento){
        super(autor, ISBN, nome);
        this.AnoLancamento=AnoLancamento;
    }

    public String toString(){
        return "Dados do livro: " +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nISBN: " + getISBN() +
                "\nAno de Lançamento: " + getAnoLancamento();
    }
}
