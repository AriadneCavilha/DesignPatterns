package Desconto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class DescontoAcimaQuinhentosReais extends Desconto {

    public DescontoAcimaQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
    
}
