package com.exemplo.sistemanotificacoes.notificacao;

public class NotificacaoEmail extends Notificacao {

    protected NotificacaoEmail(Notificacao proximaNotificacao) {
        super(proximaNotificacao);
    }

    @Override
    protected Notificacao formatarNotificacao(TipoNotificacao tipoNotificacao) {
        if(tipoNotificacao == TipoNotificacao.EMAIL) {
            System.out.println("Notificação Email");
            return this;
        }

        return proximaNotificacao.formatarNotificacao(tipoNotificacao);
    }
    
}
