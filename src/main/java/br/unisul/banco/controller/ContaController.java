package br.unisul.banco.controller;

import br.unisul.banco.controller.dto.ContaDto;
import br.unisul.banco.core.support.controller.AbstractController;
import br.unisul.banco.domain.conta.Conta;
import br.unisul.banco.domain.conta.ContaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contas")
public class ContaController extends AbstractController<Conta, ContaDto, Long, ContaService> {
}
