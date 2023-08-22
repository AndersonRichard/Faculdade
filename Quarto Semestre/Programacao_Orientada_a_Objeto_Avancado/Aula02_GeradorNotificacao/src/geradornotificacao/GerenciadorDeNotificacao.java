package geradornotificacao;

public class GerenciadorDeNotificacao {
    private Notificavel notificacao;

    public GerenciadorDeNotificacao(Notificavel notificacao) {
        this.notificacao = notificacao;
    }

    public void setNotificacao(Notificavel notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao() {
        notificacao.enviarNotificacao();
    }
}
