package com.loja.pedido;

import com.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private final String cliente;
    private final LocalDateTime data;
    private final Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public String getCliente() {
        return cliente;
    }
}
