package br.unisul.banco.config;

import br.unisul.banco.domain.agencia.Agencia;
import br.unisul.banco.domain.agencia.AgenciaRepository;
import br.unisul.banco.domain.cliente.Cliente;
import br.unisul.banco.domain.cliente.ClienteRepository;
import br.unisul.banco.domain.cliente.TipoSexo;
import br.unisul.banco.domain.conta.Conta;
import br.unisul.banco.domain.conta.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {

    private final AgenciaRepository agenciaRepository;
    private final ClienteRepository clienteRepository;
    private final ContaRepository contaRepository;

    @Autowired
    public DbService(AgenciaRepository agenciaRepository,
                     ClienteRepository clienteRepository,
                     ContaRepository contaRepository) {
        this.agenciaRepository = agenciaRepository;
        this.clienteRepository = clienteRepository;
        this.contaRepository = contaRepository;
    }

    public void inicializaBancoDeDados() {

        Agencia agencia = Agencia.builder()
                .bairro("Centro")
                .cidade("Tubarão")
                .numero(11111)
                .build();

        Agencia agenciaSave = agenciaRepository.save(agencia);

        Cliente cliente = Cliente.builder()
                .idade(21)
                .nome("José")
                .sexo(TipoSexo.MASCULINO)
                .build();

        Cliente clienteSave = clienteRepository.save(cliente);

        Conta conta = Conta.builder()
                .agencia(Agencia.builder().id(agenciaSave.getId()).build())
                .cliente(Cliente.builder().id(clienteSave.getId()).build())
                .saldo(0.0)
                .build();

        contaRepository.save(conta);
    }

}
