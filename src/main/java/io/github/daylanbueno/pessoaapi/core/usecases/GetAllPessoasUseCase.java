package io.github.daylanbueno.pessoaapi.core.usecases;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;

import java.util.List;

public interface GetAllPessoasUseCase {

    public List<Pessoa> execute();
}
