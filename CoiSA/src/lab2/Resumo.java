package lab2;
//CLasse auxiliar apenas para usar de atributo em RegistroResumo
public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo){
        this.conteudo = conteudo;
        this.tema = tema;
    }

    public String getTema(){
        return tema;
    }

    public String getConteudo(){
        return conteudo;
    }
}
