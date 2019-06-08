package br.unisul.banco.domain.cliente;

import br.unisul.banco.core.support.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente implements BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private TipoSexo sexo;

    @Column(name = "idade")
    private Integer idade;

}
