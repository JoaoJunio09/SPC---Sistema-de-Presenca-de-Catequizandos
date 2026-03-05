package br.com.joaojuniodev.spc.repositories;

import br.com.joaojuniodev.spc.models.Missa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissaRepository extends JpaRepository<Missa, Long> {
}
