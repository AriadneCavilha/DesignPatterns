package com.exemplo.sistemanotificacoes.notificacao;

public class NotificacaoSMS extends Notificacao {

    protected NotificacaoSMS(Notificacao proximaNotificacao) {
        super(proximaNotificacao);
    }

    @Override
    protected Notificacao formatarNotificacao(TipoNotificacao tipoNotificacao) {
        if(tipoNotificacao == TipoNotificacao.SMS){
            System.out.println("Notificação SMS");
            return this;
        }
        
        return proximaNotificacao.formatarNotificacao(tipoNotificacao);
    }
    
}
