package Loja.Imposto;

import java.math.BigDecimal;

import Loja.Orcamento.Orcamento;

public interface Imposto {
    
    BigDecimal calcular(Orcamento orcamento);

}
