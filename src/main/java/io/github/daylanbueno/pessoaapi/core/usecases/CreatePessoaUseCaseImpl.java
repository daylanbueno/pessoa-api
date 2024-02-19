package io.github.daylanbueno.pessoaapi.core.usecases;

import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;
import io.github.daylanbueno.pessoaapi.core.exceptions.BusinessException;
import io.github.daylanbueno.pessoaapi.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements  CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
       Pessoa pessoaExistente = pessoaGateway.findByCpfCnpj(pessoa.cpfCnpj());
       if(pessoaExistente != null) {
           throw new BusinessException("Já existe uma pessoa com CPF/CNPJ "+pessoa.cpfCnpj() + " cadastrado!");
       }
        return pessoaGateway.createPessoa(pessoa);
    }
}
