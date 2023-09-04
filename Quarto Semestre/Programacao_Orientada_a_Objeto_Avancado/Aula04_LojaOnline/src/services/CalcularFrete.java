package services;

import models.Produto;

public class CalcularFrete {
    private static final double TAXA_PESO = 0.1; // Taxa por quilo
    private static final double TAXA_TAMANHO_PEQUENO = 5.0;
    private static final double TAXA_TAMANHO_MEDIO = 10.0;
    private static final double TAXA_TAMANHO_GRANDE = 15.0;

    public double calcularFrete(Produto produto) {
        double custoFrete = 0.0;

        // Calcula o custo baseado no peso
        custoFrete += produto.getPeso() * TAXA_PESO;

        // Calcula o custo baseado no tamanho
        String tamanho = produto.getTamanho();
        switch (tamanho) {
            case "Pequeno":
                custoFrete += TAXA_TAMANHO_PEQUENO;
                break;
            case "Médio":
                custoFrete += TAXA_TAMANHO_MEDIO;
                break;
            case "Grande":
                custoFrete += TAXA_TAMANHO_GRANDE;
                break;
            default:
                // Tamanho não reconhecido
                break;
        }

        return custoFrete;
    }
}
