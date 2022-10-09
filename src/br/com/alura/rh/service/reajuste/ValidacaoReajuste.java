package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

// Dependency Inversion Principle
public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento) throws ValidacaoException;
}
