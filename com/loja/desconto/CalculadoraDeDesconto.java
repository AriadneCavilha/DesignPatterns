package com.loja.desconto;

import java.math.BigDecimal;

import com.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
    
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoAcimaDeCincoItens(
                                new DescontoAcimaQuinhentosReais(
                                    new SemDesconto()
                                )
                            );
        return desconto.efetuarCalculo(orcamento);
    };
}
