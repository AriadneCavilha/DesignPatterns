package com.loja.pedido;

import com.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injecao de dependencias: repository, service..

    public void executar(GerarPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar dados em banco");
        System.out.println("Enviar dados pelo email");
    }
}
