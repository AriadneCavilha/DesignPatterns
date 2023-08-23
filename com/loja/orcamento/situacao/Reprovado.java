package com.loja.orcamento.situacao;

import com.loja.orcamento.Orcamento;

public class Reprovado extends Situacao {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
