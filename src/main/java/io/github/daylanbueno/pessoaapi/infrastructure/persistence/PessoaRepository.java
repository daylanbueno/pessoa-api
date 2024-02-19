package io.github.daylanbueno.pessoaapi.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    PessoaEntity findByCpfCnpj(String cpfCnpj);
}
