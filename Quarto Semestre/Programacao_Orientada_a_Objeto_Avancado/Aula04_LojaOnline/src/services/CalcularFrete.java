package services;

import models.Produto;
import models.Tamanho;

public class CalcularFrete {
    private static final double TAXA_PESO = 0.1; // Taxa por quilo
    private static final double TAXA_TAMANHO_PEQUENO = 5.0;
    private static final double TAXA_TAMANHO_MEDIO = 10.0;
    private static final double TAXA_TAMANHO_GRANDE = 15.0;

    public double calcularFrete(Produto produto) {
        double custoFrete = 0.0;


        custoFrete += produto.getPeso() * TAXA_PESO;


        Tamanho tamanho = produto.getTamanho();
        switch (tamanho) {
            case PEQUENO:
                custoFrete += TAXA_TAMANHO_PEQUENO;
                break;
            case MEDIO:
                custoFrete += TAXA_TAMANHO_MEDIO;
                break;
            case GRANDE:
                custoFrete += TAXA_TAMANHO_GRANDE;
                break;
            default:
                // Tamanho não reconhecido
                break;
        }

        return custoFrete;
    }
}