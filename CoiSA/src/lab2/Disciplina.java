package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nome;
    private int horasEstudo;
    private double[] notas;
    private double media;

    public Disciplina(String nome) {
        this.nome = nome;
        this.notas = new double[4];
        this.horasEstudo = 0;
        this.media = 0.0;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double calculaMedia() {
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        this.media = soma / notas.length;
        return this.media;
    }

    public boolean aprovado() {
        calculaMedia();
        return this.media >= 7.0;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.horasEstudo + " " + this.media + " " + Arrays.toString(notas);
    }
}