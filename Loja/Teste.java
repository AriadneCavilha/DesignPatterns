package Loja;

import java.math.BigDecimal;

import Loja.Imposto.CalculadoraImposto;
import Loja.Imposto.TipoImposto;
import Loja.Orcamento.Orcamento;

public class Teste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calculadora = new CalculadoraImposto();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
    }
}
