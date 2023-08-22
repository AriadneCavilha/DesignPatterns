package Loja.Imposto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
       return imposto.calcular(orcamento);
    };
}
