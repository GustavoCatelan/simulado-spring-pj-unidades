package br.com.fiap.simuladospringpjunidades.dto.request;

import jakarta.validation.constraints.NotNull;

public record AbstractRequest (

    @NotNull(message = "O id é campo obrigatório")
    Long id
){

}
