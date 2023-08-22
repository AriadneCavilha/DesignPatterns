package Loja.Imposto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal(("0.1")));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal(("0.06")));
            default:
                return BigDecimal.ZERO;
        }
    };
}
