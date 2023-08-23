package com.loja;

import java.math.BigDecimal;

import com.loja.desconto.CalculadoraDeDesconto;
import com.loja.orcamento.Orcamento;

public class Teste {
    public static void main(String[] args) {
        Orcamento primeiroProduto = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundoProduto = new Orcamento(new BigDecimal("600"), 5);
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiroProduto));
        System.out.println(calculadora.calcular(segundoProduto));
        System.out.println(primeiroProduto.getSituacao());
        primeiroProduto.aprovar();
        primeiroProduto.aplicarDescontoExtra();
        System.out.println(calculadora.calcular(primeiroProduto));

    }
}
