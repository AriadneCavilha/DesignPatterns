package com.loja.imposto;

import java.math.BigDecimal;

import com.loja.orcamento.Orcamento;

public class ISS implements Imposto {
    
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(("0.06")));
    };
}
