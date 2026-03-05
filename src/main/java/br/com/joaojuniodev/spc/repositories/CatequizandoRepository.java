package br.com.joaojuniodev.spc.repositories;

import br.com.joaojuniodev.spc.models.Catequizando;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatequizandoRepository extends JpaRepository<Catequizando, Long> {
}
