package br.unisul.banco.domain.conta;

import br.unisul.banco.core.support.entity.BaseEntity;
import br.unisul.banco.domain.agencia.Agencia;
import br.unisul.banco.domain.cliente.Cliente;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "conta")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Conta implements BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saldo")
    private Double saldo;

    @ManyToOne
    @JoinColumn(name = "agengia_id")
    private Agencia agencia;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
