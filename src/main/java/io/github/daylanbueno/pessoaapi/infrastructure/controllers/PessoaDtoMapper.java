package io.github.daylanbueno.pessoaapi.infrastructure.controllers;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;
import io.github.daylanbueno.pessoaapi.infrastructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.nome(), pessoa.email(), pessoa.cpfCnpj(), pessoa.tipo());
    }

    public Pessoa toDomain(PessoaDto pessoaDto) {
        return  new Pessoa(null, pessoaDto.nome(), pessoaDto.email(), pessoaDto.cpfCnpj(), pessoaDto.tipoPessoa());
    }
}
