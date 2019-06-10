package br.unisul.banco.controller;

import br.unisul.banco.domain.agencia.Agencia;
import br.unisul.banco.domain.agencia.AgenciaService;
import br.unisul.banco.controller.dto.AgenciaDto;
import br.unisul.banco.core.support.controller.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agencias")
public class AgenciaController extends AbstractController<Agencia, AgenciaDto, Long, AgenciaService> {
}
