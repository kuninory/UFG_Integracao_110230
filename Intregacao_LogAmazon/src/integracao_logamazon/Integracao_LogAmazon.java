package integracao_logamazon;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Integracao_LogAmazon {
    
    private String fonte;
    private String informacao;
    private String instante;

    private Integracao_LogAmazon() {
    }
    
    public Integracao_LogAmazon(String fonte, String informacao) throws FonteInvalidaException, InformacaoInvalidaException, UnsupportedEncodingException{
        setFonte(fonte);
        setInformacao(informacao);
        setInstante();
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

    public void setInformacao(String informacao) throws InformacaoInvalidaException, UnsupportedEncodingException {
        
        //verifica se é null
        if(informacao==null){
            throw new InformacaoInvalidaException("A INFORMAÇÃO não pode ser 'null'!");
        }
        
        //verifica se é maior que 2KB
        final byte[] utf8Bytes = informacao.getBytes("UTF-8");
        if(utf8Bytes.length>2048){
            throw new InformacaoInvalidaException("A INFORMAÇÃO não pode ter mais de 2KB!");
        }
        this.informacao = informacao;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInstante() {
        SimpleDateFormat formatUTC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        formatUTC.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.instante= formatUTC.format(new Date());
    }

    public String getInstante() {
        return instante;
    }
    
}