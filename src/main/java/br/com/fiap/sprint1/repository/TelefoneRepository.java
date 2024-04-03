package br.com.fiap.sprint1.repository;

import br.com.fiap.sprint1.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
