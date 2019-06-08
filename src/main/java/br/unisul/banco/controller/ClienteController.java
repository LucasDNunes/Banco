package br.unisul.banco.controller;

import br.unisul.banco.domain.cliente.Cliente;
import br.unisul.banco.domain.cliente.ClienteService;
import br.unisul.banco.controller.dto.ClienteDto;
import br.unisul.banco.core.support.controller.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/clientes")
public class ClienteController extends AbstractController<Cliente, ClienteDto, Long, ClienteService> {
}
