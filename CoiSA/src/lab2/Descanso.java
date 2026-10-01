package lab2;

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

    public String getStatusGeral() {
        if (numSemanas > 0 && (horasDescanso / numSemanas) >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
