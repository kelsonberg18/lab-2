package lab2;

public class RegistroResumo {
    private Resumo[] resumos;
    private int quantidade; // Controla quantos resumos já foram adicionados
    private int proximoIndice; // Controla a posição da próxima inserção (buffer circular)

    public RegistroResumo(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidade = 0;
        this.proximoIndice = 0;
    }
    //metodo para adicionar um resumo
    public void adiciona(String tema, String conteudo) {
        // Verifica se já existe um resumo com o mesmo tema (regra: Não pode existir mais de um)
        for (int i = 0; i < this.quantidade; i++) {
            if (this.resumos[i].getTema().equals(tema)) {
                // Se o tema já existe, apenas atualizamos o conteúdo e encerramos o método
                this.resumos[i] = new Resumo(tema, conteudo);
                return;
            }
        }
        //se o tema não existe, adicionamos no array usando o índice circular
        this.resumos[proximoIndice] = new Resumo(tema, conteudo);

        //Aumenta a quantidade apenas se o array ainda não estiver cheio
        if (this.quantidade < this.resumos.length) {
            this.quantidade++;
        }
        // Atualiza o próximo índice de forma circular (se chegar no limite, volta pro 0)
        this.proximoIndice = (this.proximoIndice + 1) % this.resumos.length;
    }
    //Metodo que retorna um array de Strings com os resumos formatados
    public String[] pegaResumos() {
        String[] formatoRetorno = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            formatoRetorno[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return formatoRetorno;
    }
    //Metodo que imprime a string formatada com os temas
    public String imprimeResumos() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("- ").append(this.quantidade).append(" resumo(s) cadastrado(s)\n- ");

        for (int i = 0; i < this.quantidade; i++) {
            resultado.append(this.resumos[i].getTema());
            if (i < this.quantidade - 1) {
                resultado.append(" | "); // Adiciona o separador entre os temas
            }
        }
        return resultado.toString();
    }
    // Metodo que retorna a quantidade de resumos cadastrados
    public int conta() {
        return this.quantidade;
    }

    //Metodo que verifica se um tema existe
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}