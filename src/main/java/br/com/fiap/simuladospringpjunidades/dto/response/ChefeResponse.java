package br.com.fiap.simuladospringpjunidades.dto.response;

import br.com.fiap.simuladospringpjunidades.entity.Tipo;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public record ChefeResponse (

    Long id,

    Boolean substituto,

    LocalDateTime inicio,

    LocalDateTime fim,

    UsuarioResponse usuario,

    UnidadeResponse unidade
){

}
