package br.unisul.banco.controller.dto;

import br.unisul.banco.domain.cliente.TipoSexo;
import br.unisul.banco.core.support.entity.BaseDto;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDto extends BaseDto {

    private Long id;
    private String nome;
    private TipoSexo sexo;
    private Integer idade;
}
