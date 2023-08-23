package com.loja;

import com.loja.pedido.GeraPedidoHandler;
import com.loja.pedido.GerarPedido;

import java.math.BigDecimal;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerarPedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.executar(gerarPedido);
    }
}
