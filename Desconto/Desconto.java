package Desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public abstract class Desconto {
    
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        if(deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        } else {
            return proximo.efetuarCalculo(orcamento);
        }
    };

    public abstract boolean deveAplicar(Orcamento orcamento);
}
