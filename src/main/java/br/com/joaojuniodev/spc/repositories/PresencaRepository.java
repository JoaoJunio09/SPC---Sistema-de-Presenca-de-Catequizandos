package br.com.joaojuniodev.spc.repositories;

import br.com.joaojuniodev.spc.models.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long> {
}
