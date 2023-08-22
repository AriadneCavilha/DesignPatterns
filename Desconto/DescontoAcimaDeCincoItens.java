package Desconto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class DescontoAcimaDeCincoItens extends Desconto {

    public DescontoAcimaDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
        }
        
        return proximo.calcular(orcamento);
    }
    
}
