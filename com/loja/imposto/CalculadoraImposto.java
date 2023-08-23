package com.loja.imposto;

import java.math.BigDecimal;

import com.loja.orcamento.Orcamento;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
       return imposto.calcular(orcamento);
    };
}
