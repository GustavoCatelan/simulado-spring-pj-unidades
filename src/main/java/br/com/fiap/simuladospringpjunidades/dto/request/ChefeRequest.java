package br.com.fiap.simuladospringpjunidades.dto.request;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record ChefeRequest (

    Boolean substituto,

    AbstractRequest usuario,

    AbstractRequest unidade,

    @FutureOrPresent
    LocalDateTime inicio,

    @FutureOrPresent
    LocalDateTime fim
){

}
