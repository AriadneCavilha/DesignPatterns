package Loja.Imposto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class ICMS implements Imposto {
    
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(("0.1")));
    };
}