package com.loja.imposto;

import java.math.BigDecimal;

import com.loja.orcamento.Orcamento;

public interface Imposto {
    
    BigDecimal calcular(Orcamento orcamento);

}
