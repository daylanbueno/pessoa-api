package io.github.daylanbueno.pessoaapi.core.usecases;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;

public interface CreatePessoaUseCase {
    public Pessoa execute(Pessoa pessoa);
}
