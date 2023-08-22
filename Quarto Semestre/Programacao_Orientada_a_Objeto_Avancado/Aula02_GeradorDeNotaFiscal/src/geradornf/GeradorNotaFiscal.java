package geradornf;

public class GeradorNotaFiscal {
    private EnviadorEmail email;
    private NotaFiscalDao dao;

    public EnviadorEmail getEmail() {
        return email;
    }

    public void setEmail(EnviadorEmail email) {
        this.email = email;
    }

    public NotaFiscalDao getDao() {
        return dao;
    }

    public void setDao(NotaFiscalDao dao) {
        this.dao = dao;
    }

    public GeradorNotaFiscal(EnviadorEmail email, NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, getImpostoSimples(valor));

        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;
    }

    private double getImpostoSimples(double valor) {
        return valor * 0.6;
    }
}
