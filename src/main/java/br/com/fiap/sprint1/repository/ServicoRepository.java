package br.com.fiap.sprint1.repository;

import br.com.fiap.sprint1.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
