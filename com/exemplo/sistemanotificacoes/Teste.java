package com.exemplo.sistemanotificacoes;

import com.exemplo.sistemanotificacoes.notificacao.EnviarNotificacoes;
import com.exemplo.sistemanotificacoes.notificacao.TipoNotificacao;

public class Teste {
    public static void main(String[] args) {
        new EnviarNotificacoes().enviarNotificacao(TipoNotificacao.EMAIL);
    }
}
