package br.unisul.banco.domain.cliente;

import br.unisul.banco.core.support.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends AbstractService<Cliente, Long, ClienteRepository> implements ClienteService {
}
