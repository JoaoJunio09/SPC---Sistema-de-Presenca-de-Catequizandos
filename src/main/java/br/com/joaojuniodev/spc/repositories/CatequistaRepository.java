package br.com.joaojuniodev.spc.repositories;

import br.com.joaojuniodev.spc.models.Catequista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatequistaRepository extends JpaRepository<Catequista, Long> {
}
