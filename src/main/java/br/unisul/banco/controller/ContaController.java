package br.unisul.banco.controller;

import br.unisul.banco.controller.dto.ContaDto;
import br.unisul.banco.core.support.controller.AbstractController;
import br.unisul.banco.domain.conta.Conta;
import br.unisul.banco.domain.conta.ContaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/contas")
public class ContaController extends AbstractController<Conta, ContaDto, Long, ContaService> {

    @PostMapping(value = "{id}/depositar", params = {"deposito"})
    public Double depositar(@PathVariable Long id, @RequestParam("deposito") Double deposito){
        return service.depositar(id, deposito);
    }

    @PutMapping(value = "{id}/sacar", params = {"saque"})
    public Double sacar(@PathVariable Long id, @RequestParam("saque") Double saque){
        return service.sacar(id, saque);
    }
}
