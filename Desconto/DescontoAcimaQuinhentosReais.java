package Desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoAcimaQuinhentosReais extends Desconto {

    public DescontoAcimaQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
