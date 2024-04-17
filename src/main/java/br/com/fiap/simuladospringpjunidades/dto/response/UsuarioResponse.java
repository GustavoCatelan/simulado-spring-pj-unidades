package br.com.fiap.simuladospringpjunidades.dto.response;

import lombok.Builder;

@Builder
public class UsuarioResponse {

    Long id;

    String username;

    PessoaResponse pessoa;
}
