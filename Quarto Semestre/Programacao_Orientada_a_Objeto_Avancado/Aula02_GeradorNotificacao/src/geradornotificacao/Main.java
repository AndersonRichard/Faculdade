package geradornotificacao;

public class Main {
    public static void main(String[] args) {
        NotificacaoPorEmail email = new NotificacaoPorEmail();
        NotificacaoNoApp app = new NotificacaoNoApp();
        NotificacaoPorPush push = new NotificacaoPorPush();

        GerenciadorDeNotificacao geradorNF = new GerenciadorDeNotificacao(email);
        geradorNF.enviarNotificacao();  

        geradorNF.setNotificacao(app);
        geradorNF.enviarNotificacao();

        geradorNF.setNotificacao(push);
        geradorNF.enviarNotificacao();

    }
}
