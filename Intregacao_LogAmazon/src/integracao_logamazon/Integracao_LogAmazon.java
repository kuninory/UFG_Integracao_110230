package integracao_logamazon;

public class Integracao_LogAmazon {
    
    private String fonte;
    private String informacao;

    private Integracao_LogAmazon() {
    }
    
    public Integracao_LogAmazon(String fonte, String informacao) throws FonteInvalidaException{
        setFonte(fonte);
        setInformacao(informacao);
    }
    
    public void setFonte(String fonte) throws FonteInvalidaException{
        
        //verifica se é null
        if(fonte==null){
            throw new FonteInvalidaException("A FONTE não pode ser 'null'!");
        }
        
        //verifica se é maior que 100 caracteres
        if(fonte.length()>100){
            throw new FonteInvalidaException("A FONTE não pode ter mais de 100 caracteres!");
        }
        
        this.fonte = fonte;
        
    }
    public String getFonte(){
        return fonte;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    
}
