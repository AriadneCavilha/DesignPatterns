package Desconto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public abstract class Desconto {
    
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
