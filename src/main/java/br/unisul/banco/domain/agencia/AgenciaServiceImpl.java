package br.unisul.banco.domain.agencia;

import br.unisul.banco.core.support.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class AgenciaServiceImpl extends AbstractService<Agencia, Long, AgenciaRepository> implements AgenciaService {
}
