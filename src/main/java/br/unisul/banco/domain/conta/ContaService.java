package br.unisul.banco.domain.conta;

import br.unisul.banco.core.support.service.BaseService;

public interface ContaService extends BaseService<Conta, Long> {

    Double depositar(final Long idConta, final Double valorDeposito);

    Double sacar(final Long idConta, final Double valorSaque);
}
