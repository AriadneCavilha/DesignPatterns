package com.loja;

import com.loja.pedido.GeraPedidoHandler;
import com.loja.pedido.GerarPedido;
import com.loja.pedido.acao.EnviarEmailPedido;
import com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerarPedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido())
        );
        handler.executar(gerarPedido);
    }
}
