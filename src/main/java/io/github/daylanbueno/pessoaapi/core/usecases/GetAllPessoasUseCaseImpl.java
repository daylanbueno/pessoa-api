package io.github.daylanbueno.pessoaapi.core.usecases;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;
import io.github.daylanbueno.pessoaapi.core.gateways.PessoaGateway;

import java.util.List;

public class GetAllPessoasUseCaseImpl implements  GetAllPessoasUseCase {

    private final PessoaGateway pessoaGateway;

    public GetAllPessoasUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public List<Pessoa> execute() {
        return pessoaGateway.obtainAllPessoas();
    }
}
