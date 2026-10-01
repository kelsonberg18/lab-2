package lab2;

public class Disciplina {
    private String nome;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasEstudo() {
        return horasEstudo;
    }

}
