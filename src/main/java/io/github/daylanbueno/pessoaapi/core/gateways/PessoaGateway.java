package io.github.daylanbueno.pessoaapi.core.gateways;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;

import java.util.List;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);

    Pessoa findByCpfCnpj(String cpfCnpj);

    List<Pessoa> obtainAllPessoas();
}
