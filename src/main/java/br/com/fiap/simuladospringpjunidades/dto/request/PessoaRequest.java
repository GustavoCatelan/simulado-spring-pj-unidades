package br.com.fiap.simuladospringpjunidades.dto.request;

import br.com.fiap.simuladospringpjunidades.entity.Tipo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PessoaRequest (

    @Size(min = 3, max = 100)
    @NotNull(message = "O nome é obrigatório")
    String nome,

    @Size(min = 3, max = 100)
    String sobrenome,

    @Email(message = "Email inválido")
    @NotNull(message = "O atributo email é obrigatório")
    String email,

    @PastOrPresent(message = "A data de nascimento não pode ser no futuro")
    @NotNull(message = "O atributo data de nascimento é obrigatório")
    LocalDate nascimento,

    Tipo tipo
){

}
