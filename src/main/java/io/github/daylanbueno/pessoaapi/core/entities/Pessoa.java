package io.github.daylanbueno.pessoaapi.core.entities;

import io.github.daylanbueno.pessoaapi.core.enums.EnumTipoPessoa;

public record Pessoa(Long id,
                     String nome,
                     String email,
                     String cpfCnpj,
                     EnumTipoPessoa tipo) {}
