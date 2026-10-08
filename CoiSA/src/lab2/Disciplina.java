package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nome;
    private int horasEstudo;
    private double[] notas;
    private double media;
    // construtor onde inicializa os atributos o e array das 4 notas
    public Disciplina(String nome) {
        this.nome = nome;
        this.notas = new double[4];
        this.horasEstudo = 0;
        this.media = 0.0;
    }
    //metodo usado no main para cadastrar horas
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    //metodo que atualiza a nota, no Array de notas, assumindo a posição 1 do array para 1ª nota e não posição 0.
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    //metodo auxiliar para fazer o calculo da media, utilizando uma variavel 'soma' e o atributo media
    public double calculaMedia() {
        double soma = 0.0;
        //laço que percorre o array de notas e incrementa com a soma
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        // calcula a media pelo total da soma
        this.media = soma / notas.length;
        return this.media;
    }
    // checa se o metodo auxiliar funciona, se media >= 7 é aprovado
    public boolean aprovado() {
        calculaMedia();
        return this.media >= 7.0;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.horasEstudo + " " + this.media + " " + Arrays.toString(notas);
    }
}