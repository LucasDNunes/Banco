package br.unisul.banco.domain.conta;

import br.unisul.banco.core.support.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl extends AbstractService<Conta, Long, ContaRepository> implements ContaService{
}
