package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestido;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getTempoInvestido() {
        return tempoInvestido;
    }

    public int getTempoEsperado() {
        return tempoEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        tempoInvestido += tempo;

    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestido >= tempoEsperado) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoInvestido + "/" + tempoEsperado;
    }
}
