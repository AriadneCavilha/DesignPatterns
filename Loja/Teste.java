package Loja;

import java.math.BigDecimal;

import Desconto.CalculadoraDeDesconto;
import Loja.Orcamento.Orcamento;

public class Teste {
    public static void main(String[] args) {
        Orcamento primeiroProduto = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundoProduto = new Orcamento(new BigDecimal("600"), 5);
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiroProduto));
        System.out.println(calculadora.calcular(segundoProduto));
    }
}
