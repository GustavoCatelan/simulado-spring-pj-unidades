package br.com.fiap.simuladospringpjunidades.service;

import br.com.fiap.simuladospringpjunidades.dto.request.PessoaRequest;
import br.com.fiap.simuladospringpjunidades.dto.response.PessoaResponse;
import br.com.fiap.simuladospringpjunidades.entity.Pessoa;
import br.com.fiap.simuladospringpjunidades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PessoaService implements ServiceDTO<Pessoa, PessoaRequest, PessoaResponse>{

    @Autowired
    private PessoaRepository repo;

    @Override
    public Pessoa toEntity(PessoaRequest pessoaRequest) {

        if (Objects.isNull(pessoaRequest)) return null;

        return Pessoa.builder()
                .nome(pessoaRequest.nome())
                .sobrenome(pessoaRequest.sobrenome())
                .email(pessoaRequest.email())
                .nascimento(pessoaRequest.nascimento())
                .tipo(pessoaRequest.tipo())
                .build();
    }

    @Override
    public PessoaResponse toResponse(Pessoa pessoa) {
        return PessoaResponse.builder()
                .id(pessoa.getId())
                .nome(pessoa.getNome())
                .sobrenome(pessoa.getSobrenome())
                .email(pessoa.getEmail())
                .nascimento(pessoa.getNascimento())
                .tipo(pessoa.getTipo())
                .build();

    }

    @Override
    public Pessoa findById(Long id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Pessoa> findAll(Example<Pessoa> example){
        return repo.findAll(example);
    }

    @Override
    public List<Pessoa> findAll(){
        return repo.findAll();
    }

    @Override
    public Pessoa save(Pessoa entity){
        return repo.save(entity);
    }
}
