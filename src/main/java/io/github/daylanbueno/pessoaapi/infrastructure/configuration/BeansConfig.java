package io.github.daylanbueno.pessoaapi.infrastructure.configuration;

import io.github.daylanbueno.pessoaapi.core.gateways.PessoaGateway;
import io.github.daylanbueno.pessoaapi.core.usecases.CreatePessoaUseCase;
import io.github.daylanbueno.pessoaapi.core.usecases.CreatePessoaUseCaseImpl;
import io.github.daylanbueno.pessoaapi.core.usecases.GetAllPessoasUseCase;
import io.github.daylanbueno.pessoaapi.core.usecases.GetAllPessoasUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public GetAllPessoasUseCase getAllPessoasUseCase(PessoaGateway pessoaGateway) {
        return new GetAllPessoasUseCaseImpl(pessoaGateway);
    }
}
