package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestido;
    private int tempoEsperado;

    //construtor 1 que é pedido na especificação, onde tempo esperado na disciplina é 120.
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }
    // construtor 2 também é pedido na especificação, sem valor inicial diferente do padrão.
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
    // metodo que vai ser usado como parametro no main para incrementar o tempo online na disciplina
    public void adicionaTempoOnline(int tempo) {
        tempoInvestido += tempo;

    }
    // metodo que faz a checagem se o tempo investido é de 120 ou > 120
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
