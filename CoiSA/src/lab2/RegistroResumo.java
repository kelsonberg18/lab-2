package lab2;

public class RegistroResumo {
    private int cont;
    private Resumo[] resumos;

    public RegistroResumo(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.cont = 0;
    }

    public void adicionaResumo(String tema, String conteudo){
        this.resumos[this.cont] = new Resumo(tema, conteudo);
        this.cont++;
    }

    public int conta(){
        return this.cont;
    }

    public String[] pegaResumos(){
        String[] novaLista = new String[this.resumos.length];
        for (int i = 0; i < this.conta(); i++) {
            novaLista[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return novaLista;
    }

    public String imprimeResumos(){
        String saida = "";
        saida = saida + "- " + this.conta() + " resumo(s) cadastrado(s)\n";
        saida = saida + "- ";

        for (int i = 0; i < this.conta(); i++) {
            saida = saida + this.resumos[i].getTema();
            if (i < this.conta() - 1) {
                saida = saida + " | ";
            }
        }
        return saida;
    }

    public int contaResumos(){

    }

    public boolean temResumo(String tema){
        for (int i = 0; i < this.conta(); i++) {
            if (this.resumos[i].getTema().equals(temaProcurado)) {
                return true;
            }
        }
        return false;

    }
}
