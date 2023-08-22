package Loja.Orcamento;

import java.math.BigDecimal;

public class Orcamento {
    
    private BigDecimal valor; // para valores é interessante utilizar BigDecimal
    private int quantidadeItens;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

}
