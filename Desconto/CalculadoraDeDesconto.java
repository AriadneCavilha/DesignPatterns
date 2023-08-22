package Desconto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class CalculadoraDeDesconto {
    
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoAcimaDeCincoItens(
                                new DescontoAcimaQuinhentosReais(
                                    new SemDesconto()
                                )
                            );
        return desconto.calcular(orcamento);
    };
}
