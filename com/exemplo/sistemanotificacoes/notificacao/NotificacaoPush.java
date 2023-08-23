package com.exemplo.sistemanotificacoes.notificacao;

public class NotificacaoPush extends Notificacao {

    protected NotificacaoPush(Notificacao proximaNotificacao) {
        super(proximaNotificacao);
    }

    @Override
    protected Notificacao formatarNotificacao(TipoNotificacao tipoNotificacao) {
        if(tipoNotificacao == TipoNotificacao.PUSH) {
            System.out.println("Notificação Push");
            return this;
        }

        return proximaNotificacao.formatarNotificacao(tipoNotificacao);
    }
    
}
