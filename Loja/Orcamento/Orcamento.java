package Loja.Orcamento;

import java.math.BigDecimal;

public class Orcamento {
    
    private BigDecimal valor; // para valores é interessante utilizar BigDecimal

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }


    public BigDecimal getValor() {
        return valor;
    }
}
