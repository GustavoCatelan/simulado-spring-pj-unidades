package br.com.fiap.simuladospringpjunidades.dto.response;

import lombok.Builder;

@Builder
public record UsuarioResponse (

    Long id,

    String username,

    String password,

    PessoaResponse pessoa
){

}
