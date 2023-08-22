package SistemaNotificacoes;

import SistemaNotificacoes.Notificacao.TipoNotificacao;
import SistemaNotificacoes.Notificacao.EnviarNotificacoes;

public class Teste {
    public static void main(String[] args) {
        new EnviarNotificacoes().enviarNotificacao(TipoNotificacao.EMAIL);
    }
}
