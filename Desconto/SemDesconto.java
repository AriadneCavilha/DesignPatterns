package Desconto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
    
}
