package br.unisul.banco.controller.dto;

import br.unisul.banco.core.support.entity.BaseDto;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgenciaDto extends BaseDto {

    private Long id;
    private Integer numero;
    private String cidade;
    private String bairro;
}
