package lab2;
//classe que faz o calculo de horas de descanso e checa se o aluno tá descansado ou cansado
public class Descanso {
    private int horasDescanso;
    private int numSemanas;
    private String statusGeral;

    public Descanso() {
        this.statusGeral = "cansado";

    }
    public void defineHorasDescanso(int valor) {
        horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        numSemanas = valor;
    }
    // condicional que checa a divisão de horas de descanso pelo num de semana deve ser no minimo 26
    public String getStatusGeral() {
        if (numSemanas > 0 && (horasDescanso / numSemanas) >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
