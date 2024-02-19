package io.github.daylanbueno.pessoaapi.infrastructure.dtos;

import io.github.daylanbueno.pessoaapi.core.enums.EnumTipoPessoa;

public record PessoaDto(
        String nome,
        String email,
        String cpfCnpj,
        EnumTipoPessoa tipoPessoa
) {
}
