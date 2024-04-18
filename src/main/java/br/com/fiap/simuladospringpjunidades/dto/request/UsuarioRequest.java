package br.com.fiap.simuladospringpjunidades.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UsuarioRequest (

    @Size(min = 3, max = 100)
    @NotNull(message = "O username é obrigatório")
    String username,

    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,16}")
    @NotNull(message = "Senha é obrigatório!")
    String password,

    AbstractRequest pessoa
){

}
