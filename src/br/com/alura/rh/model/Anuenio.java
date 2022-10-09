package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {

    private BigDecimal valor;
    private LocalDate data;

    public Anuenio(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return this.valor;
    }

    @Override
    public LocalDate data() {
        return this.data;
    }

    // Anuênio não tem imposto de renda, mas mesmo assim temos que
    // implementar o método por ser obrigatório da interface Reajuste (incorreto).
    @Override
    public BigDecimal valorImpostoDeRenda() {
        return null;
    }
}
