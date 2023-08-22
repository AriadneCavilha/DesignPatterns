package SistemaNotificacoes.Notificacao;

public class SemNotificacao extends Notificacao {

    protected SemNotificacao() {
        super(null);
    }

    @Override
    protected Notificacao formatarNotificacao(TipoNotificacao tipoNotificacao) {
        return null;
    }
    
}
