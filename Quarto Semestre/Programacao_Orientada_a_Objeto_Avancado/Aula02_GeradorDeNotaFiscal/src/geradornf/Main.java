package geradornf;

public class Main {
    public static void main(String[] args) {

        EnviadorEmail email = new EnviadorEmail();
        NotaFiscalDao dao = new NotaFiscalDao();
        Fatura fatura = new Fatura();

        GeradorNotaFiscal geradorNF = new GeradorNotaFiscal(email, dao);
        geradorNF.gera(fatura);

    }
}
