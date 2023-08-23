package com.exemplo.sistemanotificacoes.notificacao;

public class SemNotificacao extends Notificacao {

    protected SemNotificacao() {
        super(null);
    }

    @Override
    protected Notificacao formatarNotificacao(TipoNotificacao tipoNotificacao) {
        return null;
    }
    
}
