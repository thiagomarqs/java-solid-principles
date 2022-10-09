package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{

    /** Validação do percentual do reajuste. Deve ser até 40% do salário */
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        var salario = funcionario.getSalario();
        var percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
