package io.github.daylanbueno.pessoaapi.infrastructure.gateways;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;
import io.github.daylanbueno.pessoaapi.core.gateways.PessoaGateway;
import io.github.daylanbueno.pessoaapi.infrastructure.persistence.PessoaEntity;
import io.github.daylanbueno.pessoaapi.infrastructure.persistence.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryGateway implements PessoaGateway {

    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper entityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        PessoaEntity entity = entityMapper.toEntity(pessoa);
        PessoaEntity novaPessoa = pessoaRepository.save(entity);
        return entityMapper.toPessoa(novaPessoa);
    }

    @Override
    public Pessoa findByCpfCnpj(String cpfCnpj) {
        PessoaEntity entity = pessoaRepository.findByCpfCnpj(cpfCnpj);
        if (entity == null) {
            return null;
        }
        return entityMapper.toPessoa(entity);
    }

    @Override
    public List<Pessoa> obtainAllPessoas() {
        return pessoaRepository
                .findAll()
                .stream()
                .map(entityMapper::toPessoa)
                .collect(Collectors.toList());
    }
}
