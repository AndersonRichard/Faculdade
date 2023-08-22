package geradornotificacao;

public class GerenciadorDeNotificacao {
    private Notificavel notificacao;

    public GerenciadorDeNotificacao(Notificavel notificacao) {
        this.notificacao = notificacao;
    }

    public void setModifica(Notificavel notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao() {
        notificacao.enviarNotificacao();
    }
}
