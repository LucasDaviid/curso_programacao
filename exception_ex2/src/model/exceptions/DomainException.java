package model.exceptions;

public class DomainException extends Exception{ // colocamos extends Exception pois diferente de RuntimeException o compilador obriga a tratar
    private static final long serialVersionUID = 1L; // Por Exception ser serializebol ele necessita ter uma versão, no caso é o valor padrão 1

    public DomainException(String msg){ //O construtor foi feito para permitir instanciar a extensão personalizada passando uma mensagem.
        super(msg);
    }
}
