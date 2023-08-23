package com.exemplo.sistemanotificacoes.notificacao;


public class EnviarNotificacoes {
    
    public Notificacao enviarNotificacao(TipoNotificacao tipoNotificacao) {
        Notificacao notificacao = new NotificacaoEmail(
            new NotificacaoSMS(
                new NotificacaoPush(
                    new SemNotificacao()
                )
            )
        );

        return notificacao.formatarNotificacao(tipoNotificacao);
    }   
}
