package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

    public BigDecimal valor();
    public LocalDate data();
    public BigDecimal valorImpostoDeRenda();
}
