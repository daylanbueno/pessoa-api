package io.github.daylanbueno.pessoaapi.infrastructure.gateways;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;
import io.github.daylanbueno.pessoaapi.infrastructure.persistence.PessoaEntity;
import org.springframework.stereotype.Component;

@Component
public class PessoaEntityMapper {

    public PessoaEntity toEntity(Pessoa pessoa) {
        return new PessoaEntity(pessoa.id(), pessoa.nome(), pessoa.email(), pessoa.cpfCnpj(), pessoa.tipo());
    }

    public Pessoa toPessoa(PessoaEntity entity) {
        return new Pessoa(entity.getId(), entity.getNome(), entity.getEmail(), entity.getCpfCnpj(), entity.getTipo());
    }
}
