package br.com.fiap.simuladospringpjunidades.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_USUARIO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_PESSOA", columnNames = "PESSOA"),
        @UniqueConstraint(name = "UK_USERNAME", columnNames = "USERNAME_USU")
})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(name = "SQ_USUARIO", sequenceName = "SQ_USUARIO", allocationSize = 1)
    @Column(name = "ID_USU")
    private Long id;

    @Column(name = "USERNAME_USU")
    private String username;

    @Column(name = "PASS_USU")
    private String password;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(
                    name = "FK_PESSOA_USUARIO"
            )
    )
    private Pessoa pessoa;

}
