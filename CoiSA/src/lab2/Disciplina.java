package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nome;
    private int horasEstudo;
    private double[] notas;
    private double media;
    private int[] pesos;

    public Disciplina(String nome){
        this.nome = nome;
        this.notas = new double[4];
        this.horasEstudo = 0;
        this.media = 0.0;
    }

    public Disciplina(String nome, double[] notas, int[] pesos){
        this.nome = nome;
        this.notas = notas;
        this.pesos = pesos;
    }

    public Disciplina(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public void cadastraHoras(int horas){
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }

    public double calculaMedia(){
        double soma = 0.0;
        if (pesos == null){
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            media = soma / notas.length;
        }else{
            int somaPesos = 0;
            for (int i = 0; i < notas.length; i++){
                soma +=(notas[i] * pesos[i]);
                somaPesos += pesos[i];
            }
            media = somaPesos > 0 ? soma / somaPesos : 0.0;
        }
        return media;
    }

    public boolean aprovado(){
        calculaMedia();
        return media >= 7.0;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.horasEstudo + " " + media + " " + Arrays.toString(notas);
    }



}
