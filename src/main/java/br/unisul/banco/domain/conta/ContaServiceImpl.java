package br.unisul.banco.domain.conta;

import br.unisul.banco.core.exception.RegistroNaoEncontradoException;
import br.unisul.banco.core.support.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl extends AbstractService<Conta, Long, ContaRepository> implements ContaService {

    @Override
    public Conta salvar(Conta entity) {
        return super.salvar(entity);
    }

    @Override
    public Double depositar(final Long idConta, final Double valorDeposito) {
        Conta conta = this.buscarPorId(idConta).orElseThrow(() -> new RegistroNaoEncontradoException(Conta.class.getSimpleName(), idConta));
        conta.depositar(valorDeposito);

        conta = this.salvar(conta);

        return conta.getSaldo();
    }

    @Override
    public Double sacar(final Long idConta, final Double valorSaque) {
        Conta conta = this.buscarPorId(idConta).orElseThrow(() -> new RegistroNaoEncontradoException(Conta.class.getSimpleName(), idConta));

        if (conta.getSaldo() < valorSaque) {
            throw new SaqueException(conta.getSaldo());
        }

        conta.sacar(valorSaque);
        conta = this.salvar(conta);

        return conta.getSaldo();
    }
}
