package com.loja.orcamento.situacao;

import com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Situacao {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
