package SistemaNotificacoes.Notificacao;


public abstract class Notificacao {
    
    protected Notificacao proximaNotificacao;

    protected Notificacao(Notificacao proximaNotificacao) {
        this.proximaNotificacao = proximaNotificacao;
    }

    protected abstract Notificacao formatarNotificacao(TipoNotificacao tipoNotificacao);

}
