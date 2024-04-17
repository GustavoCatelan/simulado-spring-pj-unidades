package br.com.fiap.simuladospringpjunidades.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UnidadeRequest (

    @Size(min = 3, max = 150)
    @NotNull(message = "O nome é obrigatório")
    String nome,

    @Size(min = 2, max = 7)
    @NotNull(message = "A sigla é obrigatória")
    String sigla,

    @Size(min = 2, max = 255)
    String descricao,

    AbstractRequest macro
){

}
