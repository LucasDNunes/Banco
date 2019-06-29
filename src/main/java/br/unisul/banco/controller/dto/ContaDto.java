package br.unisul.banco.controller.dto;

import br.unisul.banco.core.support.entity.BaseDto;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaDto extends BaseDto {

    private Long id;
    private AgenciaDto agencia;
    private ClienteDto cliente;
    private Double saldo;
}
