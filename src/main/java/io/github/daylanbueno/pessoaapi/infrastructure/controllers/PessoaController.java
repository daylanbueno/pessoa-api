package io.github.daylanbueno.pessoaapi.infrastructure.controllers;


import io.github.daylanbueno.pessoaapi.core.entities.Pessoa;
import io.github.daylanbueno.pessoaapi.core.usecases.CreatePessoaUseCase;
import io.github.daylanbueno.pessoaapi.core.usecases.GetAllPessoasUseCase;
import io.github.daylanbueno.pessoaapi.infrastructure.dtos.PessoaDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final GetAllPessoasUseCase getAllPessoasUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        Pessoa novoPessoa = createPessoaUseCase.execute(pessoaDtoMapper.toDomain(pessoaDto));
        return pessoaDtoMapper.toDto(novoPessoa);
    }

    @GetMapping
    public List<PessoaDto> obtainAll() {
        return getAllPessoasUseCase.execute()
                .stream().map(pessoaDtoMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/app")
    public String  app() {
        return "Testando github actions....";
    }

}
