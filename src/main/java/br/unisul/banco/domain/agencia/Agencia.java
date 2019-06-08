package br.unisul.banco.domain.agencia;

import br.unisul.banco.core.support.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "agencia")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agencia implements BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numeros")
    private Integer numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "bairro")
    private String bairro;

}
