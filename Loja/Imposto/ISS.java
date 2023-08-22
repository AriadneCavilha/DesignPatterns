package Loja.Imposto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class ISS implements Imposto {
    
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(("0.06")));
    };
}
