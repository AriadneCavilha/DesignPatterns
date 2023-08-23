package Desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoAcimaDeCincoItens extends Desconto {

    public DescontoAcimaDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

}
